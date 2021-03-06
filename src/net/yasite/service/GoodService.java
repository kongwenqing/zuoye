package net.yasite.service;

import net.yasite.entity.GoodEntity;
import net.yasite.entity.GoodListEntity;
import net.yasite.entity.MyGoodEntity;
import net.zuoye.api.BaseAPI;
import net.zuoye.api.GoodInfoAPI;
import net.zuoye.api.GoodListAPI;
import net.zuoye.api.SearchGoodAPI;
import android.content.Context;

public class GoodService extends BaseService {

	public GoodService(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	
	public GoodListEntity getGoodList(String page,String id){
		BaseAPI api = new GoodListAPI(context, page, id);
		try {
			if(api.doGet()){
				return (GoodListEntity) api.getHandleResult();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public MyGoodEntity getGoodInfo(String id){
		BaseAPI api = new GoodInfoAPI(context, id);
		try {
			if(api.doGet()){
				return (MyGoodEntity)api.getHandleResult();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public Object searchGood(String name){
		BaseAPI api = new SearchGoodAPI(context, name);
		try {
			if(api.doGet()){
				return api.getHandleResult();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
