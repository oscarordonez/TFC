package com.tfc.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.widget.*;
import com.tfc.patxangueitor.R;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tfc.patxangueitor.adminlistview;


public class SubsListFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.subslist, null);
        ExpandableListView elv = (ExpandableListView) v.findViewById(R.id.explist);
        elv.setAdapter(new SubscriptionListAdapter());
        return v;


        /*elv.setOnChildClickListener(new ExpandableListView.OnChildClickListener()
        {
            @Override
            public boolean onChildClick(ExpandableListView arg0, View arg1, int arg2, int arg3, long arg4)
            {
                Intent intent = new Intent(,adminlistview.class);
                Bundle b = new Bundle();
                b.putString("Status","Connected");
                intent.putExtras(b);
                startActivity(intent);
                return false;
            }
        });*/
    }
    /*@Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);
        String[] values = new String[] { "Subscripció 1", "Subscripció 2", "Subscripció 3" };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1, values);

        lv1 = (ListView)getView().findViewById(R.id.listView1);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Intent myIntent = new Intent(v.getContext(), subslist.class);
                startActivity(myIntent);
            }
        });
    }*/
    public class SubscriptionListAdapter extends BaseExpandableListAdapter {

        /*private String[] groups = { "People Names", "Dog Names", "Cat Names", "Fish Names" };

        private String[][] children = {
                { "Arnold", "Barry", "Chuck", "David" },
                { "Ace", "Bandit", "Cha-Cha", "Deuce" },
                { "Fluffy", "Snuggles" },
                { "Goldy", "Bubbles" }
        };*/
        private String[] groups = { "Subscripcions"};
        private String[] children = {"Subscripció Llista 1","Subscripció Llista 2","Subscripció Llista 3"};

        @Override
        public int getGroupCount() {
            return groups.length;
        }

        @Override
        public int getChildrenCount(int i) {
            /*return children[i].length;*/
            return children.length;
        }

        @Override
        public Object getGroup(int i) {
            return groups[i];
        }

        @Override
        public Object getChild(int i, int i1) {
            /*return children[i][i1];*/
            return children[i1];
        }

        @Override
        public long getGroupId(int i) {
            return i;
        }

        @Override
        public long getChildId(int i, int i1) {
            return i1;
        }

        @Override
        public boolean hasStableIds() {
            return true;
        }

        @Override
        public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
            TextView textView = new TextView(SubsListFragment.this.getActivity());
            textView.setText(getGroup(i).toString());
            return textView;
        }

        @Override
        public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
            TextView textView = new TextView(SubsListFragment.this.getActivity());
            textView.setText(getChild(i, i1).toString());
            return textView;
        }

        @Override
        public boolean isChildSelectable(int i, int i1) {
            return true;
        }
    }
}