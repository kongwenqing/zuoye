package net.zuoye.api;

import net.yasite.entity.SocerListEntity;
import net.zuoye.api.params.SocerListParams;
import net.zuoye.api.params.Urls;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;

import android.content.Context;

public class SocerListAPI extends BaseAPI {

	public SocerListAPI(Context context,SocerListParams pm) {
		super(context,pm);
		setMethod(Urls.WEB_SERVER_PATH + Urls.API+ Urls.socerList);
	}

	@Override
	public SocerListEntity handlerResult(JSONObject json) throws JSONException {
		// TODO Auto-generated method stub
		return new Gson().fromJson(json.toString(), SocerListEntity.class);
	}

}
