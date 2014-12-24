package com.lightroller.app;

import java.util.Locale;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class PlanetFragment extends Fragment {
    public static final String ARG_PLANET_NUMBER = "planet_number";
	private TaskFragment mTaskFragment;

    public PlanetFragment() {
        // Empty constructor required for fragment subclasses
    }

    public TaskFragment getTaskFragment() {
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        mTaskFragment = (TaskFragment) fragmentManager.findFragmentByTag(TaskFragment.TAG_TASK_FRAGMENT);
        if (mTaskFragment == null) {
          mTaskFragment = TaskFragment.getInstance();
          fragmentManager.beginTransaction().add(mTaskFragment, TaskFragment.TAG_TASK_FRAGMENT).commit();
        }  
        return mTaskFragment;
    }
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_planet, container, false);
        
        //getTaskFragment().setTargetFragment(this, 0);
        getTaskFragment().setProgressBar(rootView);
        //getTaskFragment().restart();
        
        int i = getArguments().getInt(ARG_PLANET_NUMBER);
        String planet = getResources().getStringArray(R.array.planets_array)[i];

        int imageId = getResources().getIdentifier(planet.toLowerCase(Locale.getDefault()),
                        "drawable", getActivity().getPackageName());
        ((ImageView) rootView.findViewById(R.id.image)).setImageResource(imageId);
        getActivity().setTitle(planet);
        return rootView;
    }
}
