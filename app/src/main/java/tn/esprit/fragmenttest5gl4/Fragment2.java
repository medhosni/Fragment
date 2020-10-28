package tn.esprit.fragmenttest5gl4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Fragment2 extends Fragment {


    public Fragment2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_2, container, false);
        Button frag =view.findViewById(R.id.frag3);


        frag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment f3 =new Fragment3();
                Bundle b =new Bundle();
                b.putString("name ","Mohamed");
                
                f3.setArguments(b);
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frag,f3).commit();

            }
        });
        return view;

    }
}