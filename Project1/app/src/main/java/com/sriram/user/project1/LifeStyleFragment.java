package com.sriram.user.project1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;


public class LifeStyleFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,  Bundle savedInstanceState) {
//TODO Auto-generated method stub

        View view = inflater.inflate(R.layout.fragment_life_style, container, false);
        ExpandableListView elv = (ExpandableListView) view.findViewById(R.id.expandlifestyle);
        elv.setAdapter(new SavedTabsListAdapter());
        return view;
    }
    public class SavedTabsListAdapter extends BaseExpandableListAdapter {

        private String[] groups = { "Dress Category", "Mobiles", "Restuarants", "Vechiles" };

        private String[][] children = {
                { "Jeans","Shirts", "Formals", "Casuals", "Salwar","Kurthas", "Coats", "Sarees", "Shots" },
                { "Samsung","Lava","Nokia","Celkon","Iphone 6S","Micromax","Android One","Moto G"},
                { "Swagath", "Surabhi","Taj Banjar","Haveli","Khalsa","Bilal","Bhuneshwari","Khandelwal Pavitra Bhojnalaya"},
                { "Hero Honda","Passion","Suzuki","Passion Plus","FZ","Mahindra","Royal EnField" }
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
            TextView textView = new TextView(LifeStyleFragment.this.getActivity());
            textView.setText(getGroup(i).toString());
            return textView;
        }

        @Override
        public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
            TextView textView = new TextView(LifeStyleFragment.this.getActivity());
            textView.setText(getChild(i, i1).toString());
            return textView;
        }

        @Override
        public boolean isChildSelectable(int i, int i1) {
            return true;
        }

    }

}

