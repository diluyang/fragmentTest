package com.helloworld.helloworld;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;


public class TitleFragment extends Fragment {

    private ImageButton im_button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.title_fragment_layout,container,false);
        im_button = (ImageButton) view.findViewById(R.id.im_button);

        im_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),"业务逻辑写在Fragment上，Activity是不是很整洁了？",Toast.LENGTH_SHORT).show();
            }
        });


        return view;
    }
}
