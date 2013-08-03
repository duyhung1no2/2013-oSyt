package com.duyhung.sportscore.adapter;

import java.util.List;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.duyhung.sportscore.NewsFragment;

public class NewsPagerAdapter extends FragmentPagerAdapter {

	private List<NewsFragment> fragList;

	public NewsPagerAdapter(FragmentManager fm, List<NewsFragment> list) {
		super(fm);
		this.fragList = list;
	}

	public NewsFragment getItem(int position) {
		return fragList.get(position);
	}

	@Override
	public int getCount() {
		return fragList.size();
	}

}
