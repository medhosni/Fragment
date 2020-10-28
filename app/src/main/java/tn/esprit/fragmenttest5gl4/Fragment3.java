package tn.esprit.fragmenttest5gl4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Fragment3 extends Fragment {


    public Fragment3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_3, container, false);
        TextView text =view.findViewById(R.id.text);
    if (getArguments()!= null)
    {
        String s =getArguments().getString("name ");

        text.setText(s);

    }

    return  view ;

    }
}