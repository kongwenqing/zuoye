package net.zuoye.api;


import net.yasite.entity.NewsListEntity;
import net.zuoye.api.params.ListParams;
import net.zuoye.api.params.Urls;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;

import android.content.Context;

public class ListAPI extends BaseAPI {

	public ListAPI(Context context, ListParams pm) {
		super(context, pm);
		setMethod(Urls.WEB_SERVER_PATH + Urls.API+ Urls.list + "?page=" + pm.getPage());
	}

	@Override
	public NewsListEntity handlerResult(JSONObject json) throws JSONException {
		// TODO Auto-generated method stub
		return new Gson().fromJson(json.toString(), NewsListEntity.class);
	}
}
