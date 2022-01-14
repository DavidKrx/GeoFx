package dad.geo.api;
import dad.geo.model.All;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

interface GeoInterface {

	//@GET("ip_api.php")
	//public Call<All> ConnectionData(@Path("IP") String IP);
	//@GET("ip_api.php?ip={IP}")
	//public Call<All> ConnectionData(@Path("IP") String IP);
	//@GET("ip_api.php?ip={IP}")
	//public Call<All> ConnectionData(@Query("IP") String IP);
	@GET("ip_api.php")
	public Call<All> ConnectionData(@Query("IP") String IP);
}
