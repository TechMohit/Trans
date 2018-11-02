package com.example.varadhi.trans;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class Newaddvehicle extends Fragment {


    RecyclerView recyclerView,otherdocuments,recyclerfinancial,recyclervehiclefitness;
    private List<Team_Pojo> teamList = new ArrayList<>();

    private RecyclerTeamAdapter adapter;

    public static Fragment newInstance(String s) {
        return new  Newaddvehicle ();
    }


    LinearLayout basicdetailslayout,basictotallayout;
    TextView basicdetails;
    CardView basiccardview;
    ImageView basicdetailsimage;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v;

        v = inflater.inflate(R.layout.fragment_addvehicle, container, false);






        recyclerView = v.findViewById(R.id.recyclerteammembers);
        otherdocuments = v.findViewById(R.id.otherdocumentsrecyclerview);
        //recyclerfinancial = v.findViewById(R.id.recyclerfinancialdetails);
        //recyclervehiclefitness = v.findViewById(R.id.vehiclefitness);

        basicdetailslayout = v.findViewById(R.id.basicdetails);
        basictotallayout = v.findViewById(R.id.basictotal);
        basicdetails = v.findViewById(R.id.basictext);
        basiccardview = v.findViewById(R.id.basiccardvw);
        basicdetailsimage = v.findViewById(R.id.basicimage);




        adapter= new RecyclerTeamAdapter(getActivity(),teamList);
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        Recyclerotherdocuments recyclerotherdocuments = new Recyclerotherdocuments(getActivity(), teamList);
        LinearLayoutManager mLayoutManager2 = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        otherdocuments.setLayoutManager(mLayoutManager2);
        otherdocuments.setItemAnimator(new DefaultItemAnimator());
        otherdocuments.setAdapter(recyclerotherdocuments);

       /* Recyclerfinancial recyclerfinancialadapter = new Recyclerfinancial(getActivity(), teamList);
        LinearLayoutManager mLayoutManager3 = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recyclerfinancial.setLayoutManager(mLayoutManager3);
        recyclerfinancial.setItemAnimator(new DefaultItemAnimator());
        recyclerfinancial.setAdapter(recyclerfinancialadapter);*/

       /* Recyclervehiclefitness recyclervehiclefitnessadapter = new Recyclervehiclefitness(getActivity(), teamList);
        LinearLayoutManager mLayoutManager4 = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        recyclervehiclefitness.setLayoutManager(mLayoutManager4);
        recyclervehiclefitness.setItemAnimator(new DefaultItemAnimator());
        recycl222222222222222222ervehiclefitness.setAdapter(recyclervehiclefitnessadapter);
*/
        getData();


        basicdetailslayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if (basictotallayout.isShown()) {

                    basictotallayout.setVisibility(View.GONE);
                    basicdetails.setTextColor(getResources().getColor(R.color.white));
                    basicdetailslayout.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                    basicdetailsimage.setImageDrawable(getResources().getDrawable(R.drawable.ic_circule_drop_down_spinner));

                }
                else
                {

                    basictotallayout.setVisibility(View.VISIBLE);
                    basicdetailslayout.setBackgroundColor(getResources().getColor(R.color.white));
                    basicdetails.setTextColor(getResources().getColor(R.color.colorPrimary));
                    basicdetailsimage.setImageDrawable(getResources().getDrawable(R.drawable.ic_arrow_drop_down_circle_black_24dp));


                }



            }
        });





        return v;
    }


    private void getData() {

        Team_Pojo team_pojo = new Team_Pojo(R.drawable.emp4, "Raghu");
        teamList.add(team_pojo);

        team_pojo = new Team_Pojo(R.drawable.emp4, "Abhi");
        teamList.add(team_pojo);

        team_pojo = new Team_Pojo(R.drawable.emp4, "nizar");
        teamList.add(team_pojo);

        team_pojo = new Team_Pojo(R.drawable.emp4, "sarup");
        teamList.add(team_pojo);

        team_pojo = new Team_Pojo(R.drawable.emp4, "sree");
        teamList.add(team_pojo);

        team_pojo = new Team_Pojo(R.drawable.emp4, "EM");
        teamList.add(team_pojo);

        team_pojo = new Team_Pojo(R.drawable.emp4, "EM");
        teamList.add(team_pojo);

        team_pojo = new Team_Pojo(R.drawable.emp4, "EM");
        teamList.add(team_pojo);

        team_pojo = new Team_Pojo(R.drawable.emp4, "EM");
        teamList.add(team_pojo);

        team_pojo = new Team_Pojo(R.drawable.emp4, "EM");
        teamList.add(team_pojo);

        team_pojo = new Team_Pojo(R.drawable.emp4, "EM");
        teamList.add(team_pojo);

        team_pojo = new Team_Pojo(R.drawable.emp4, "EM");
        teamList.add(team_pojo);

        team_pojo = new Team_Pojo(R.drawable.emp4, "EM");
        teamList.add(team_pojo);

        team_pojo = new Team_Pojo(R.drawable.emp4, "EM");
        teamList.add(team_pojo);

        adapter.notifyDataSetChanged();
    }


}
