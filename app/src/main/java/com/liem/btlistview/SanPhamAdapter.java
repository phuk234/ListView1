package com.liem.btlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SanPhamAdapter extends BaseAdapter
{
    private Context context;
    private int layout;
    private List<SanPham> sanPhamList;

    public SanPhamAdapter(Context context, int layout, List<SanPham> sanPhamList) {
        this.context = context;
        this.layout = layout;
        this.sanPhamList = sanPhamList;
    }

    @Override
    public int getCount() {
        return sanPhamList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       ViewHolder viewHolder = new ViewHolder();

       if(convertView == null){
           convertView = LayoutInflater.from(context).inflate(R.layout.layout_list_view, null);

           viewHolder.txtTenSP = convertView.findViewById(R.id.txtTenSP);
           viewHolder.txtGiaSP = convertView.findViewById(R.id.txtGiaSP);
           viewHolder.imgView = convertView.findViewById(R.id.imageView);
           convertView.setTag(viewHolder);
       }else
           viewHolder = (ViewHolder) convertView.getTag();

       SanPham sanPham = sanPhamList.get(position);
       viewHolder.txtTenSP.setText(sanPham.getTenSP());
       viewHolder.txtGiaSP.setText(sanPham.getGiaSP()+" $");
       viewHolder.imgView.setImageResource(sanPham.getHinh());

       return  convertView;
    }

    private class ViewHolder{
        ImageView imgView;
        TextView txtTenSP, txtGiaSP;
    }


}
