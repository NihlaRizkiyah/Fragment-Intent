package com.example.tugasmobile;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptorRecycleView extends RecyclerView.Adapter<AdaptorRecycleView.ViewHolder> {

    private ArrayList<ItemModel> dataItem;

    private Context context;

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textHead;
        TextView textSubhead;
        ImageView imageIcon;
        LinearLayoutCompat parentLayout;

        public  ViewHolder(@NonNull View itemView) {
            super(itemView);

            textHead = itemView.findViewById(R.id.text_title);
            textSubhead = itemView.findViewById(R.id.text_subtitle);
            imageIcon = itemView.findViewById(R.id.imageList);
            parentLayout = itemView.findViewById(R.id.parentLayout);
        }
    }

    AdaptorRecycleView(Context context,ArrayList<ItemModel> dataItem) {
        this.context = context;
        this.dataItem = dataItem;
    }

    @NonNull
    @Override
    public AdaptorRecycleView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptorRecycleView.ViewHolder holder, int position) {

        TextView textHead = holder.textHead;
        TextView textSubhead = holder.textSubhead;
        ImageView imageIcon = holder.imageIcon;

        textHead.setText(dataItem.get(position).getName());
        textSubhead.setText(dataItem.get(position).getType());
        imageIcon.setImageResource(dataItem.get(position).getImage());

        holder.parentLayout.setOnClickListener(v -> {
            Toast.makeText(context, dataItem.get(position).getName(), Toast.LENGTH_SHORT).show();

            if (dataItem.get(position).getName().equals("Bunga Mawar")) {
                Intent intent = new Intent(context, DefaultActivity.class);
                intent.putExtra("GAMBAR_DEFAULT", R.drawable.mawar);
                intent.putExtra("TEKS_DEFAULT", "Bunga Mawar");
                intent.putExtra("DESKRIPSI_DEFAULT", "Bunga mawar merah merupakan simbol dari keromantisan.");
                context.startActivity(intent);
            } if (dataItem.get(position).getName().equals("Bunga Anggrek")) {
                Intent intent = new Intent(context, DefaultActivity.class);
                intent.putExtra("GAMBAR_DEFAULT", R.drawable.anggrek);
                intent.putExtra("TEKS_DEFAULT", "Bunga Anggrek");
                intent.putExtra("DESKRIPSI_DEFAULT", "Bunga Anggrek merupakan salah satu bunga yang memiliki jenis terbanyak.");
                context.startActivity(intent);
            } if (dataItem.get(position).getName().equals("Kembang Sepatu")) {
                Intent intent = new Intent(context, DefaultActivity.class);
                intent.putExtra("GAMBAR_DEFAULT", R.drawable.kembangsepatu);
                intent.putExtra("TEKS_DEFAULT", "Kembang Sepatu");
                intent.putExtra("DESKRIPSI_DEFAULT", "Kembang Sepatu adalah tanaman yang banyak digunakan sebagai tanaman hias di daerah tropis dan subtropis.");
                context.startActivity(intent);
            } if (dataItem.get(position).getName().equals("Bunga Lavender")) {
                Intent intent = new Intent(context, DefaultActivity.class);
                intent.putExtra("GAMBAR_DEFAULT", R.drawable.lavender);
                intent.putExtra("TEKS_DEFAULT", "Bunga Lavender");
                intent.putExtra("DESKRIPSI_DEFAULT", "Bunga Lavender adalah bunga cantik berwarna ungu.");
                context.startActivity(intent);
            } if (dataItem.get(position).getName().equals("Bunga Matahari")) {
                Intent intent = new Intent(context, DefaultActivity.class);
                intent.putExtra("GAMBAR_DEFAULT", R.drawable.matahari);
                intent.putExtra("TEKS_DEFAULT", "Bunga Matahari");
                intent.putExtra("DESKRIPSI_DEFAULT", "Bunga Matahari tersebut memiliki arti kesetiaan.");
                context.startActivity(intent);
            } if (dataItem.get(position).getName().equals("Bunga Melati")) {
                Intent intent = new Intent(context, DefaultActivity.class);
                intent.putExtra("GAMBAR_DEFAULT", R.drawable.melati);
                intent.putExtra("TEKS_DEFAULT", "Bunga Melati");
                intent.putExtra("DESKRIPSI_DEFAULT", "Bunga Melati melambangkan kesucian, keanggunan dalam kesederhanaan dan ketulusan.");
                context.startActivity(intent);
            } if (dataItem.get(position).getName().equals("Bunga Teratai")) {
                Intent intent = new Intent(context, DefaultActivity.class);
                intent.putExtra("GAMBAR_DEFAULT", R.drawable.teratai);
                intent.putExtra("TEKS_DEFAULT", "Bunga Teratai");
                intent.putExtra("DESKRIPSI_DEFAULT", "Bunga Teratai melambangkan cinta dan kehidupan.");
                context.startActivity(intent);
            } if (dataItem.get(position).getName().equals("Bunga Tulip")) {
                Intent intent = new Intent(context, DefaultActivity.class);
                intent.putExtra("GAMBAR_DEFAULT", R.drawable.tulip);
                intent.putExtra("TEKS_DEFAULT", "Bunga Tulip");
                intent.putExtra("DESKRIPSI_DEFAULT", "Bunga Tulip memiliki bentuk yang sederhana berbentuk kuncup tampak seperti belum mekar");
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataItem.size();
    }
}
