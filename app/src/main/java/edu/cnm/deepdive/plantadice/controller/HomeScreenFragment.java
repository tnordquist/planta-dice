package edu.cnm.deepdive.plantadice.controller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.fragment.NavHostFragment;
import edu.cnm.deepdive.plantadice.R;
import edu.cnm.deepdive.plantadice.controller.HomeScreenFragmentDirections.ActionHomeFragmentToHomeSecondFragment;
import edu.cnm.deepdive.plantadice.viewmodel.HomeViewModel;

public class HomeScreenFragment extends Fragment implements OnClickListener {

  private HomeViewModel homeViewModel;

  @Override
  public void onClick(View v) {

  }

  @Override
  public View onCreateView(
      LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState
  ) {
    // Inflate the layout for this fragment
    return inflater.inflate(R.layout.fragment_plant_selection, container, false);
  }

  public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);

  }

//  public View onCreateView(@NonNull LayoutInflater inflater,
//      ViewGroup container, Bundle savedInstanceState) {
//    homeViewModel =
//        ViewModelProviders.of(this).get(HomeViewModel.class);
//    View root = inflater.inflate(R.layout.fragment_home, container, false);
////    final TextView textView = root.findViewById(R.id.text_dashboard);
//    homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//      @Override
//      public void onChanged(@Nullable String s) {
//        textView.setText(s);
//      }
//    });
//    return root;
//  }

//  @Override
//  public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//    super.onViewCreated(view, savedInstanceState);
//
//    view.findViewById(R.id.add_plant_button).setOnClickListener(new View.OnClickListener() {
//      @Override
//      public void onClick(View view) {
//        ActionHomeFragmentToHomeSecondFragment action =
//            HomeScreenFragmentDirections.
//                actionHomeFragmentToHomeSecondFragment("To Home Selection Fragment");
//        NavHostFragment.findNavController(HomeScreenFragment.this)
//            .navigate(action);
//      }
//    });
//  }
}