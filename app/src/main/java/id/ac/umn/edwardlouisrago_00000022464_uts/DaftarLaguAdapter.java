package id.ac.umn.edwardlouisrago_00000022464_uts;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class DaftarLaguAdapter extends RecyclerView.Adapter<DaftarLaguAdapter.ItemLaguViewHolder> {
    public LinkedList<SumberLagu> mDaftarLagu;
    private LayoutInflater mInflater;
    public Context mContext;

    public DaftarLaguAdapter(Context context, LinkedList<SumberLagu> daftarLagu) {
        this.mContext = context;
        this.mDaftarLagu = daftarLagu;
        this.mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ItemLaguViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.lagu_item_layout, parent, false);
        return new ItemLaguViewHolder(view, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemLaguViewHolder holder, int position) {
        SumberLagu mSumberLagu = mDaftarLagu.get(position);
        holder.tvJudul.setText(mSumberLagu.getJudul());
    }

    @Override
    public int getItemCount() {
        return mDaftarLagu.size();
    }

    class ItemLaguViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView tvJudul;
        private DaftarLaguAdapter mAdapter;
        private int mPosisi;
        private SumberLagu mSumberLagu;

        public ItemLaguViewHolder(@NonNull View itemView, DaftarLaguAdapter adapter) {
            super(itemView);
            mAdapter = adapter;
            tvJudul = (TextView) itemView.findViewById(R.id.tvJudul);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            mPosisi = getLayoutPosition();
            mSumberLagu = mDaftarLagu.get(mPosisi);
            Intent detilInten = new Intent(mContext, DetilLaguActivity.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable("DetilLagu", mSumberLagu);
            detilInten.putExtras(bundle);
            mContext.startActivity(detilInten);
        }
    }
}
