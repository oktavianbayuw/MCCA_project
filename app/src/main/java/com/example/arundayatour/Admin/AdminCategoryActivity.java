package com.example.arundayatour.Admin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.arundayatour.HomeActivity;
import com.example.arundayatour.MainActivity;
import com.example.arundayatour.R;

public class AdminCategoryActivity extends AppCompatActivity {
    private ImageView banjarnegara_object, hospital, car_price_category, yogyakarta_object;
    private ImageView culinary_info, souvenirs, adult_clothes, child_clothes;
    private ImageView promo;

    private Button LogoutBtn, CheckOrdersBtn, maintainProductsBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);


        LogoutBtn = (Button) findViewById(R.id.admin_logout_btn);
        CheckOrdersBtn = (Button) findViewById(R.id.check_orders_btn);
        maintainProductsBtn = (Button) findViewById(R.id.maintain_btn);



        maintainProductsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, HomeActivity.class);
                intent.putExtra("Admin", "Admin");
                startActivity(intent);
            }
        });


        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });

        CheckOrdersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminNewOrdersActivity.class);
                startActivity(intent);
            }
        });


        banjarnegara_object = (ImageView) findViewById(R.id.banjarnegara_tourism_object);
        hospital = (ImageView) findViewById(R.id.hospital_list);
        car_price_category = (ImageView) findViewById(R.id.car_price_category);
        yogyakarta_object = (ImageView) findViewById(R.id.yogyakarta_tourism_object);

        culinary_info = (ImageView) findViewById(R.id.culinary_info);
        souvenirs = (ImageView) findViewById(R.id.souvenirs);
        adult_clothes = (ImageView) findViewById(R.id.adult_clothes);
        child_clothes = (ImageView) findViewById(R.id.child_clothes);

        promo = (ImageView) findViewById(R.id.promo);

        banjarnegara_object.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Wisata Banjarnegara");
                startActivity(intent);
            }
        });


        hospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Info Rumah Sakit");
                startActivity(intent);
            }
        });


        car_price_category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Kategori Harga Mobil");
                startActivity(intent);
            }
        });


        yogyakarta_object.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Wisata di Yogyakarta");
                startActivity(intent);
            }
        });


        culinary_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Info Rumah Makan");
                startActivity(intent);
            }
        });


        souvenirs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Oleh Oleh Souvenir");
                startActivity(intent);
            }
        });



        adult_clothes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Oleh-Oleh Pakaian Dewasa");
                startActivity(intent);
            }
        });


        child_clothes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Pakaian Anak Anak");
                startActivity(intent);
            }
        });



        promo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Info Promo Wisata");
                startActivity(intent);
            }
        });

    }
}
