package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BangCuuChuongAdapter extends RecyclerView.Adapter<BangCuuChuongAdapter.BangCuuChuongViewHolder> {

    @NonNull
    @Override
    public BangCuuChuongViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bang_cuu_cuong, parent, false);
        return new BangCuuChuongViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BangCuuChuongViewHolder holder, int position) {
        holder.binding(position);
    }

    @Override
    public int getItemCount() {
        return 9;
    }

    public class BangCuuChuongViewHolder extends RecyclerView.ViewHolder {

        TextView tvCuuChuong;

        public BangCuuChuongViewHolder(@NonNull View itemView) {
            super(itemView);

            tvCuuChuong = itemView.findViewById(R.id.tv_cuu_chuong);
        }

        public void binding(int data) {
            StringBuilder stringBuffer = new StringBuilder();

            stringBuffer.append("Bảng cưu chương " + (data+2) + ":\n");
            for (int i = 1; i <= 10; i++) {
                stringBuffer.append("\t\t\t\t\t"+(data + 2) + " x " + i + " = " + ((data + 2) * i) + "\n");
            }

            tvCuuChuong.setText(stringBuffer.toString());
        }
    }
}
