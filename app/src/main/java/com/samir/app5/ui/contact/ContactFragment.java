package com.samir.app5.ui.contact;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.samir.app5.Entity.Contacts;
import com.samir.app5.R;
import com.samir.app5.adapter.ContactsAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContactFragment extends Fragment {

    private RecyclerView recyclerView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_contact, container, false);
        recyclerView = root.findViewById(R.id.recyclerView);

        List<Contacts> contactsList = new ArrayList<>();

        contactsList.add(new Contacts("Samir Acharya","9865203584", R.drawable.noimage));
        contactsList.add(new Contacts("Sudip Khadka","9875125632", R.drawable.noimage));
        contactsList.add(new Contacts("Biraj Maharjan","9865868521", R.drawable.noimage));
        contactsList.add(new Contacts("Pujan Shakya","9861254864", R.drawable.noimage));
        contactsList.add(new Contacts("Dood","45868585989785", R.drawable.noimage));

        ContactsAdapter contactsAdapter = new ContactsAdapter(getActivity(), contactsList);
        recyclerView.setAdapter(contactsAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return root;
    }
}