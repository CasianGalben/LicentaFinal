package com.casian.aplicatiefinala;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.FirebaseApiNotAvailableException;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.OnProgressListener;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

public class ImageUpload extends AppCompatActivity {



    ImageView imageView;
    Button saveBtn,uploadBtn;
    ProgressBar progressBar;
    DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Images");
    StorageReference storageReference = FirebaseStorage.getInstance().getReference();
    Uri uri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_upload);
        imageView=findViewById(R.id.image_view1);
        saveBtn=findViewById(R.id.btn_save);
        uploadBtn=findViewById(R.id.btn_upload);
        progressBar=findViewById(R.id.btn_progress);


        progressBar.setVisibility(View.INVISIBLE);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                startActivityForResult(intent,2);
            }
        });
        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ImageUpload.this,ShowActivity.class);
                startActivity(intent);
            }
        });
        uploadBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(uri!= null){
                    UploadImageToFireBase(uri);
                }
                else {
                    Toast.makeText(ImageUpload.this, "Plese select images", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void UploadImageToFireBase(Uri uri) {
        StorageReference file = storageReference.child(System.currentTimeMillis()+ "."+getFileExtension(uri));
        file.putFile(uri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                file.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                    @Override
                    public void onSuccess(Uri uri) {

                        ImageModel model = new ImageModel(uri.toString());
                        String Smodel = reference.push().getKey();
                        reference.child(Smodel).setValue(model);
                        progressBar.setVisibility(View.INVISIBLE);
                        imageView.setImageResource(R.drawable.ic_baseline_add_photo_alternate_24);
                        Toast.makeText(ImageUpload.this,"Image Uploaded succ",Toast.LENGTH_LONG).show();

                    }
                });
            }
        }).addOnProgressListener(new OnProgressListener<UploadTask.TaskSnapshot>() {
            @Override
            public void onProgress(@NonNull UploadTask.TaskSnapshot snapshot) {

                progressBar.setVisibility(View.VISIBLE);


            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(ImageUpload.this,"Failed!!",Toast.LENGTH_LONG).show();

            }
        });

    }

    private String getFileExtension(Uri uri) {
        ContentResolver contentResolver = getContentResolver();
        MimeTypeMap map = MimeTypeMap.getSingleton();
        return map.getExtensionFromMimeType(contentResolver.getType(uri));

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 2 && requestCode == RESULT_OK && data != null){
            uri=data.getData();
            imageView.setImageURI(uri);

        }
    }
}