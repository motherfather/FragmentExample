package com.bit2016.fragmentexample;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends Fragment {


    public MyFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        TextView tv = new TextView(getActivity());
//        tv.setText("I am Fragment");
//        tv.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_light));

        View rootView = inflater.inflate(R.layout.layout_myfragment, container, false);

        final View finalRootView = rootView;
        rootView.findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)finalRootView.findViewById(R.id.textView)).setText("clicked");
                getActivity().getSupportFragmentManager().beginTransaction().replace(android.R.id.content, new MyFragment2()).commit();
            }
        });
        return rootView;
    }
}
