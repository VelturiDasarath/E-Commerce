package com.sriram.user.project1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import android.app.ExpandableListActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;

public class homeFragment extends Fragment  {

    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,  Bundle savedInstanceState) {
//TODO Auto-generated method stub

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        ExpandableListView elv = (ExpandableListView) view.findViewById(R.id.expandlists);
        elv.setAdapter(new SavedTabsListAdapter());
        return view;
    }
    public class SavedTabsListAdapter extends BaseExpandableListAdapter {

        private String[] groups = { "Small Appliances", "Large Applicances", "Kitchen and Dining", "Furniture" };

        private String[][] children = {
                { "Air conditioning","Air ioniser", "Appliance plug", "Aroma lamp", "Attic fan","Bachelor griller", "Back boiler", "Beverage opener", "Box mangle" },
                { "Freezer,Refrigerator","Water cooler","Stoves","Cooker","Microwave oven","Washing equipment","Washing machine"},
                { "Magnificent Larder", "Custom Contemporary","Eclectic Kitchen","Measuring Cups","Measuring Spoons","Mixing Bowls","Colander","Vegetable Peeler"},
                { "Chair","Bean bag","Chaise longue","Fauteuil","Ottoman","Recliner","Stool" }
        };

        @Override
        public int getGroupCount() {
            return groups.length;
        }

        @Override
        public int getChildrenCount(int i) {
            return children[i].length;
        }

        @Override
        public Object getGroup(int i) {
            return groups[i];
        }

        @Override
        public Object getChild(int i, int i1) {
            return children[i][i1];
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
            TextView textView = new TextView(homeFragment.this.getActivity());
            textView.setText(getGroup(i).toString());
            return textView;
        }

        @Override
        public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
            TextView textView = new TextView(homeFragment.this.getActivity());
            textView.setText(getChild(i, i1).toString());
            return textView;
        }

        @Override
        public boolean isChildSelectable(int i, int i1) {
            return true;
        }

    }

}
