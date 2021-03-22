package id.ac.umn.edwardlouisrago_00000022464_uts;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemLaguViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
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
        mSumberLagu = mAdapter.mDaftarLagu.get(mPosisi);
        Intent detilInten = new Intent(mAdapter.mContext, DetilLaguActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("DetilLagu", mSumberLagu);
        detilInten.putExtras(bundle);
        mAdapter.mContext.startActivity(detilInten);
    }
}
