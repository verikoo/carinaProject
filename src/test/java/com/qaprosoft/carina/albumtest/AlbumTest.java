package com.qaprosoft.carina.albumtest;

import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

import com.qaprosoft.apitools.validation.JsonCompareKeywords;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;

import mytest.AlbumsGetMethod;
import mytest.PostAlbumMethod;

public class AlbumTest implements IAbstractTest{
	@Test()
	@MethodOwner(owner = "VerikoLomadze")
	public void testGetAlbums() {
		AlbumsGetMethod getAlbumsMethod = new AlbumsGetMethod();
		
		getAlbumsMethod.callAPI();
		getAlbumsMethod.expectResponseStatus(HttpResponseStatusType.OK_200);
		getAlbumsMethod.validateResponse(JSONCompareMode.LENIENT, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
	}
	
	@Test()
	@MethodOwner(owner = "VerikoLomadze")
	public void testPostAlbums() {
		PostAlbumMethod postAlbumMethod = new PostAlbumMethod();
		
		postAlbumMethod.callAPI();
		postAlbumMethod.expectResponseStatus(HttpResponseStatusType.CREATED_201);
		postAlbumMethod.validateResponse();
		
	}
	
	

}
