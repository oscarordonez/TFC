package com.tfc.adapters;

import android.content.Intent;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.tfc.patxangueitor.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tfc.patxangueitor.adminlistview;

public class SubsListFragment extends Fragment {
    private ListView lv1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_subslist, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        String[] values = new String[] { "Subscripció 1", "Subscripció 2", "Subscripció 3" };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1, values);

        lv1 = (ListView)getView().findViewById(R.id.listView1);
        lv1.setAdapter(adapter);

    }
 }