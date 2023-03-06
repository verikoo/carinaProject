package mytest;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.zebrunner.carina.utils.Configuration;




@Endpoint(url = "${base_url}/albums", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/albums/_get/rs.json")
public class AlbumsGetMethod extends AbstractApiMethodV2 {
	public AlbumsGetMethod () {
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	}
	

}
