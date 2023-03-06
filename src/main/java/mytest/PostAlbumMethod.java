package mytest;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.RequestTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.zebrunner.carina.utils.Configuration;




@Endpoint(url="${base_url}/albums", methodType=HttpMethodType.POST)
@ResponseTemplatePath(path = "api/albums/_post/rs.json")
@RequestTemplatePath(path = "api/albums/_post/rq.json")
public class PostAlbumMethod extends AbstractApiMethodV2 {
	public PostAlbumMethod () {
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	}

}
