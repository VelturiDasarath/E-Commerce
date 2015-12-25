package com.sriram.user.project1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.TextView;


public class SuperMarketFragment extends Fragment {
    ListView lv;

    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,  Bundle savedInstanceState) {
//TODO Auto-generated method stub

        View view = inflater.inflate(R.layout.fragment_super_market, container, false);
        ExpandableListView elv = (ExpandableListView) view.findViewById(R.id.expandsuper);
        elv.setAdapter(new SavedTabsListAdapter());
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }
    public class SavedTabsListAdapter extends BaseExpandableListAdapter {

        private String[] groups = { "Vegetables", "Friuts", "Detergents", "Shampoo" };

        private String[][] children = {
                { "Tamato","Aalu", "Onion", "Raddish", "Brinjal","Carrot", "Bitter guard", "Capicorn", "Califlower" },
                { "Mango","Sapota","Grapes","Pine Apple","Papaya","Goa","Banana","Apple"},
                { "Wheel", "Ariel","Henko","Mr White","Rin","Surf excel","Gaadi","XXX"},
                { "Sunslik","All Clear","HeadnShoulders","Clinic All Clear","Dove","Patene","Chik" }
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
            TextView textView = new TextView(SuperMarketFragment.this.getActivity());
            textView.setText(getGroup(i).toString());
            return textView;
        }

        @Override
        public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
            TextView textView = new TextView(SuperMarketFragment.this.getActivity());
            textView.setText(getChild(i, i1).toString());
            return textView;
        }

        @Override
        public boolean isChildSelectable(int i, int i1) {
            return true;
        }

    }

}
