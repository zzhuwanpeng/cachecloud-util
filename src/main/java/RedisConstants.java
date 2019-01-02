public class RedisConstants {

	public static final String KEY_ALBUMDETAIL_NEW = "albumdetail_byte_new";// 专辑详情
	public static final String KEY_ALBUMPAY_NEW = "albumpay_byte_new";// 专辑付费详情
	public static final String KEY_ITINGS_ALBUMDETAIL = "itingsalbumdetail";// 爱听专辑详情
	public static final String KEY_AUDIODETAIL_NEW = "audiodetail_byte_withtag"; // 视频详情

	public static final String KEY_STARTFOCUS = "startfocus";// 开机闪屏+OS
	public static final String KEY_STARTFOCUS_V2 = "sfocusv2";// 开机闪屏+OS

	public static final String KEY_UPDATEVERSION = "updateVersion";// 升级+OS+版本

	//网宿碎片过期时长
	public static final String KEY_AUDIO_EXPIRY_TIME="audio_expiry_time";

	public static final String KEY_FLOAT_AD="floatAD";//浮层广告

	public static final String KEY_TOPCATEGORY="topCategory";

	public static final String KEY_SUBCATEGORY="subCategory";

	public static final String KEY_PRODUCTLINE_CATEGORY_TREE="productLineTree";
	public static final String KEY_CATEGORY_TREE_DETAIL="categoryDetailTree";

	public static final String KEY_CATEGORYDETAIL="categorydetail";//分类详情
	public static final String KEY_CARPRODUCERDETAIL="carproducerdetail";//车载详情


	public static final String KEY_LABEL_DATALIST_NEW="datatypev1-";//标签运营数据

	public static final String KEY_LABEL_DATALIST_UPDATETIME="datatypeUpdateTime-";//标签运营数据

	public static final String KEY_RADIO_DETAIL = "radiodetail";// 电台详情
	public static final String KEY_RADIO_DETAIL_NEW = "radiodetailv2";// 电台详情

	public static final String KEY_PGC_AUDIO = "radioAudios";// 电台id与传统电台idMap

	public static final String KEY_HOTKEY = "hotkey";// 搜索热词
	public static final String KEY_HOTKEY_TXZ = "open_hot_value";// 默认热刺同行者

	public static final String KEY_DEFAULTSEARCHKEY = "defaultSearchKey";// 搜索热词

	public static final String KEY_USER_RADIO = "userRadioListen";// 用户收听电台信息

	public static final String KEY_RADIO_MAIN_PLAYLIST = "radioMainPlayList";// 播单


	public static final String KEY_LIVE="livedetail";
	public static final String KEY_ALLLIVEIDS="allLiveIds";

	public static final String 	KEY_SWITCH="switch";//开关

	public static final String 	KEY_RICHAN_RADIO_ID="richanRadioId";//日产电台id

	public static final String KEY_TOPIC="topic";//专题
	public static final String KEY_TOPIC_ID_LIST="topicIdList";//专题ID列表
	public static final String KEY_NTOPIC_ID_LIST="n:t:i:l:";//专题ID列表

	public static final String KEY_RADIO_INSERTPLAYLIST="radioInsertPlayList";//电台插播信息
	public static final String KEY_USER_RADIO_INSERTPLAYLIST="userRadioInsertPlayList";//用户收听电台插播最后一次记录

	public static final String KEY_CLOCK_AUDIO="clockAudios";
	public static final String KEY_TYPE_RADIO="typeradios";

	public static final String KEY_TYPE_RADIO_NEW="typeradiosv1";
	public static final String KEY_TYPE_RADIO_TXZ_NEW="typeradiosv1_txz";

	public static final String KEY_CATEGORY_FEATURE="categoryFeature";//分类特性
	public static final String KEY_CATEGORY_RECOMMEND = "categoryRecommend";//分类人工推荐

	public static final String KEY_MZ_CATEGORYDETAIL="mzCategoryDetail";//媒资分类详情
	public static final Integer EXP_KEY_MZ_CATEGORYDETAIL=60*60;


	public static final String KEY_RADIO_PLAY_HISTORY = "radioPlayHistory"; //电台播放历史
	public static final String KEY_FOLLOWED_PLAY_HISTORY = "followedPlayHistory"; //我的关注历史
	public static final String KEY_RADIO_RULE = "radioRule"; //电台规则

	public static final String KEY_RADIO_TAG = "radioTag"; //电台标签

	public static final String KEY_USER_PLAY_HISTORY = "userPlayHistory"; //用户播放历史
	public static final String KEY_WORD_SHARE = "wordShare"; //文案分享
	public static final String KEY_REWARD_WORD_SHARE = "rewardWordShare"; //文案分享
	public static final String KEY_CAR_PLUGIN = "carPlugin"; //车载插件
	public static final String KEY_USER_ALBUM_UPDATE_HISTORY = "userAlbumUpdateHistory"; //用户专辑更新
	public static final String KEY_USER_ONEKEY_LISTEN_HISTORY = "userOneKeyListenHistory"; //一键收听更新
	public static final String KEY_LIVE_PLAY_DETAIL = "livePlayDetail"; //直播详情
	public static final String KEY_LIVE_ID_LIST = "liveProgramList"; //直播碎片id列表
	public static final String KEY_LIVE_USER_ID_LIST = "userLiveProgramList"; //直播碎片id列表
	public static final String KEY_LIVE_PROGRAM_DETAIL = "liveProgramDetail"; //直播碎片详情
	public static final String KEY_USER_AUDIO_UPDATE_COUNT = "user::audio::update::cnt"; //用户碎片更新数

	public static final String KEY_SHAREURL_INFO="shareurlInfo";//分享规则

	public static final String LIVE_PLAY_SUBSCRIBE = "live_play_subscribe";//被订阅的直播
	public static final String LIVE_PLAY_PREFIX_KEY = "live-play_"; //被订阅的直播电台缓存前缀
	public static final String LIVE_PLAY_PUSHED_KEY = "live-play-pushed"; //已经推送的直播电台缓存

	public static final String KEY_WEEK_RANKLIST="week-ranklist";//周排行榜

	public static final String KEY_PAGE_LABELLIST="page-labelList";//页面和运营位的对应关系
	public static final String KEY_PAGE_LABELLIST_V2="page-labelList-v2";//页面和运营位的对应关系
	public static final Integer EXP_KEY_PAGE_LABELLIST_V2=10*60;

	public static final String KEY_LIVE_ITINGS_USER_LIVE_LIST = "live_itings_user_live_list"; // 用户直播电台列表

	public static final String KEY_LIVE_HEART_BEAT= "liveHeartbeat"; // 用户直播心跳

	public static final String KEY_AUDIOLIKEDNUM = "audio_liked_num";//碎片点赞数

	public static final String KEY_LIVE_LIKED_NUM = "live_liked_num";//直播赞数key
	public static final String KEY_USER_LIVE_LIKED_NUM = "user_live_liked_num";//直播赞数key

	public static final String KEY_TOP20_ALBUM = "topAlabum20";//专辑碎片评论数key

	public static final String KEY_TOP20_AUDIO = "topAudio20";//专辑碎片评论数key

	public static final String KEY_TOP20_BROADCAST = "topBroadcast20"; //广播播放量前二十key

	public static final String KEY_RANK_KEY = "rank";//排行榜key

	public static final String KEY_CLASSIFY = "classify";//分类大全页key

	public static final String KEY_CLASSIFY_NEW = "classify_new";//分类大全页key新版

	public static final String KEY_LIVE_LISTENWEIGHTNUM="livelistenweightnum";//直播电台收听加权数

	public static final String KEY_LIVE_PLAY_TIMES = "live_play_times"; //发布直播次数

	public static final String KEY_LIVE_USER_PUSHED = "liveUserPushed";

	public static final String KEY_LIVE_PLAY_NOW_ID = "livePlayNowId";
	public static final String KEY_LIVE_PLAY_BACK_ID = "livePlayBackId";
	public static final String KEY_LIVE_PLAY_NOTICE_ID = "livePlayNoticeId";
	public static final String KEY_LIVE_PLAY_SUPPERMODE_NOW_ID = "livePlaySupperModeNowId";
	public static final String KEY_LIVE_PLAY_SUPPERMODE_NOTICE_ID = "livePlaySupperModeNoticeId";
	public static final String KEY_LIVE_PLAY_SUPPERMODE_BACK_ID = "livePlaySupperModeBackId";
	public static final String KEY_LIVE_PLAY_NOLOCK_NOW_ID = "livePlayNoLockNowId";
	public static final String KEY_LIVE_PLAY_NOLOCK_BACK_ID = "livePlayNoLockBackId";
	public static final String KEY_LIVE_PLAY_NOLOCK_NOTICE_ID = "livePlayNoLockNoticeId";
	public static final String KEY_LIVE_PLAY_NOW_BYLIVEID = "livePlayNowByLiveId";
	public static final String KEY_LIVE_PLAY_AUTH_IDS = "livePlayAuthIds";
	public static final String KEY_LIVE_PLAY_AUTH_DETAIL = "livePlayAuthDetail";

	public static final String KEY_LIVE_PROGRAM_LISTEN_NUM = "live_programe_listen_num";

	public static final String KEY_LIVE_START = "liveStart_";
	public static final String KEY_LIVE_END = "liveEnd_";
	public static final String KEY_LIVE_SATUS = "single_";

	public static final String KEY_USER_LIVE = "user_live_relation";
	public static final String KEY_USER_LIVE_RELATION = "userLiveRelation";


	public static final String KEY_BROADCAST_V2 = "broadcast_detailv2_";

	public static final String KEY_PROGRAM_NEW = "program_detail_new_";

	public static final String KEY_BROADCAST_ALL_ID_LOW = "broadcast_all_id_low_";
	public static final String KEY_BROADCAST_ALL_ID_HIGH = "broadcast_all_id_high_";

	public static final String KEY_BROADCAST_LIKEDNUM="broadcast_likednum_";//传统电台id排序列表

	public static final int KEY_1_HOUR_EXPIRE = 60*60;//1小时

	public static final int KEY_6_HOUR_EXPIRE = 6*60*60;//6小时

	public static final int KEY_12_HOUR_EXPIRE = 12*60*60;//12小时

	public static final int KEY_24_HOUR_EXPIRE = 24*60*60;//24小时

	public static final int KEY_3_DAY_EXPIRE = 3*24*60*60;//3天

	//专辑缓存过期时长
	public static final int CACHE_EXPIRE_ALBUM = 60*60;//1小时

	//碎片缓存过期时长
	public static final int CACHE_EXPIRE_AUDIO = 60*60;

	//电台id缓存过期时长
	public static final int CACHE_EXPIRE_RADIOID = 60*60;
	public static final int CACHE_EXPIRE_RADIO_DETAIL = 6*60*60;
	public static final int CACHE_EXPIRE_HOTKEY = 5*60;
	public static final int CACHE_EXPIRE_HOTKEY_TXZ = 5*60;
	public static final int CACHE_EXPIRE_SEARCH_WORD_DEF = 60*60;
	public static final int CACHE_EXPIRE_LABEL = 10*60;
	public static final int CACHE_EXPIRE_SUBCATELOG = 24*60*60;
	public static final int CACHE_EXPIRE_TREE_CATELOG = 24*60*60;
	public static final int CACHE_EXPIRE_TOPTREE_CATELOG = 24*60*60;
	public static final int CACHE_EXPIRE_TOPCATELOG = 24*60*60;
	public static final int CACHE_EXPIRE_CODE_CATELOG = 24*60*60;
	public static final int CACHE_EXPIRE_CHILD_CATELOG = 24*60*60;
	public static final int CACHE_EXPIRE_FEATURE = 60*60;
	public static final int CACHE_EXPIRE_CLASSIFY = 60*60;
	public static final int CACHE_EXPIRE_CLASSIFY_NEW = 60*60;
	public static final int CACHE_EXPIRE_CLASSIFY_LIST = 60*60;
	public static final int CACHE_EXPIRE_AD = 60*60;
	public static final int CACHE_EXPIRE_AUDIO_AD = 6*60*60;
	public static final int CACHE_EXPIRE_TAG = 60*60;
	public static final Integer CACHE_EXPIRE_BROADCAST_LIKED = 60*60;
	public static final int CACHE_EXPIRE_BROADCAST_DETAIL = 6*60*60;
	public static final int CACHE_EXPIRE_BROADCAST_PROGRAM_DETAIL = 12*60*60;
	public static final int CACHE_EXPIRE_BROADCAST_IDS = 2*60*60;
	public static final int CACHE_EXPIRE_SPLASH = 10*60;
	public static final int CACHE_EXPIRE_BROADCAST_SORT = 30*60;



	public static final String KEY_SILENT_LOGIN_VERSION = "silent_login_version";// 静默登陆版本

    public static final String KEY_RECOMMEND_SCENE = "recommend_scene_";// kradio一期场景推送


	public static final String KEY_PROGRAM_NEXT_PRE = "program_next_pre";

	public static final String KEY_LOCATION_UDID = "location";

	public static final String KEY_LOCATION_IP = "location_ip";

	public static final String KEY_LOCATION_ADCODE_IP = "location_adcode_ip";
	public static final String KEY_LOCATION_ADCODE = "location_adcode";
	public static final int EXP_LOCATION_ADCODE = 60*60;
	/**
	 * 活动详情
	 */
	public static final String KEY_ACTIVE_INFO = "active_info";

	/**
	 * 活动作品
	 */
	public static final String KEY_ACTIVE_PROGRAM = "active_program";

	/**
	 * 活动节目票数
	 */
	public static final String KEY_ACTIVE_PROGRAM_POLL = "active_program_poll";


	/**
	 * 获奖作品
	 */
	public static final String KEY_ACTIVE_PROGRAM_AWARD = "active_award_program";

	/**
	 * 活动节目开始时间
	 */
	public static final String KEY_ACTIVE_PROGRAM_NEW_TIME = "active_program_new_time";

	/**
	 * 活动节目投票用户
	 */
	public static final String KEY_ACTIVE_PROGRAM_POLL_USER = "active_program_poll_user";


	// 活动相关REDIS key End

	public static final String KEY_USER_TAG = "user_tag";

	public static final String KEY_AD_DETAIL = "addetail";
	public static final String KEY_AD_DETAIL_NEW = "addetailv1";

	public static final String KEY_AD_AUDIO_DETAIL = "adaudiodetail_new";
	public static final String KEY_AD_CATEGORY_DETAIL = "adcategorydetail";
	public static final String KEY_AD_CATEGORY_RULE = "adcategoryrule";
	public static final String KEY_AD_REPORT = "adreport_";
	public static final String KEY_AD_STARTTIME = "adstarttime";
	public static final String KEY_AD_INTERVAL = "adinterval";

	public static final String KEY_LIVE_PLAY_CATEGORY_NOW_ID = "live_play_category_suppermode_nowid_";
	public static final String KEY_LIVE_PLAY_CATEGORY_SUPPERMODE_NOW_ID = "live_play_category_suppermode_nowid_";

	public static final String KEY_LIVE_PLAY_CATEGORY_ZSET_NOTICE_ID = "live_play_category_zset_noticeid_";
	public static final String KEY_LIVE_PLAY_CATEGORY_ZSET_BACK_ID = "live_play_category_zset_backid_";
	public static final String KEY_LIVE_PLAY_CATEGORY_ZSET_NOW_ID = "live_play_category_zset_nowid_";
	public static final String KEY_LIVE_PLAY_CATEGORY_SUPPERMODE_ZSET_NOTICE_ID = "live_play_category_suppermode_zset_noticeid_";
	public static final String KEY_LIVE_PLAY_CATEGORY_SUPPERMODE_ZSET_BACK_ID = "live_play_category_suppermode_zset_backid_";
	public static final String KEY_LIVE_PLAY_CATEGORY_SUPPERMODE_ZSET_NOW_ID = "live_play_category_suppermode_zset_nowid_";

	public static final String KEY_ALBUM_CACHE = "RedisCache_AlbumInfoDto_";

	public static final String KEY_ALBUM_UPLOAD = "Album_User_Upload_";

	public static final String KEY_RAIDOID_ALL = "allradioidv1";
	public static final String KEY_PGCID_ALL = "pgcall";//kaola
	public static final String KEY_PGCID_ALL_TXZ = "txzpgcall";//txz
	public static final String KEY_PLAY_MIX_KEY = "weather_mixed_";//车载30秒播放key
	public static final String KEY_OPERATE_MACHINE = "key_operate_machine-";
	public static final String KEY_MACHINE_OPERATE = "machine_operate_v2_";


	public static final String KEY_ANTI_SPAM="反垃圾服务";
	public static final String KEY_BROADCAST_ID_SORT_NEW = "broadcast_id_sort_new_";

	public static final String KEY_BROADCAST_CLASSIFY_LIST = "broadcast_classify_";

	public static final String  KEY_REGIST_FROM_PHONE_COUNT = "regist_from_phone_count_";



	public static final String REDIS_USER = "user";
	public static final String REDIS_USER_PREFIX = "user:value:";
	public static final int EXP_USER = 60 * 60 * 24 * 14;

	public static final String REDIS_USER_INFO = "user_info";

	public static final String REDIS_USER_INFO_PREFIX = "user:info:";
	public static final int EXP_USER_INFO = 60 * 60 * 24 * 14;



	public static final String REDIS_ACTIVE_EMAIL_CODE = "active_email_code";

	public static final String REDIS_VOCDE_COUNT = "check_vcode_count";

	public static final String REDIS_AREA_PROVINCE = "area_province";

	public static final String REDIS_AREA_CITY = "area_city";

	public static final String REDIS_TOKEN = "token";

	public static final String REDIS_USER_RED_POINT_FLAG = "user_fans_redpoint";

	public static final String KEYWORDS_SENSITIVE_KEY = "keywords_sensitive";

	public static final String REDIS_NAVY_USERINFO = "navy_user_info_list";

	//用户未读通知消息数
	public static final String REDIS_USER_NOTICE_UNREAD_NUM = "u:n:u:n:";

	/**
	 * 用户最后发送时间
	 */
	public static final String LAST_SEND_LETTER_TIME = "letter_u_l_s_l_t";

	/**
	 * 用户最后发送内容
	 */
	public static final String LAST_SEND_LETTER_CONTENT = "lette_u_l_s_c_l";
	public static final String LAST_SEND_LETTER_CONTENT_KEY = "letter:ulsck:";

    /**
	 * 用户未读私信总数
	 */
	public static final String LETTER_UNREAD_NUM = "letter:unread_num";

	/**
	 * 用户未读私信总人数
	 */
	public static final String LETTER_UNREAD_USER_NUM = "letter:unread_user";


	/**
	 * 聊天室马甲
	 */
	public static final String CHAT_ROBOT = "chat_robot";

	/**
	 * 图片验证码
	 */
	public static final String IMG_VCODE = "redis_vcode";

	/**
	 * 图片验证码校验成功
	 */
	public static final String IMG_VCODE_SUCCESS = "redis_vcode_success";

	/**
	 * 密码输入次数
	 */
	public static final String PASSWORD_INPUT_ERR = "PASSWORD_INPUT_ERR";

	/**
	 * 邮箱密码修改 验证key
	 */
	public static final String EMAIL_PASSWORD_ACCESSKEY = "email_password_accesskey";

	//============================== 新增缓存key (2017-06-07 开始） ========================
	//应用电台id对应关系
	public static final String KEY_APP_RADIOIDS = "key_app_radioids";

	//用户未读评论消息数
	public static final String REDIS_USER_COMMENT_UNREAD_NUM = "u:c:u:n:";

	/**
	 * 官方用户
	 */
	public static final String OFFICIAL_USER = "official_user";


	public final static String ALBUMDETAIL_KEY="RedisCache_AlbumInfoDto_";//专辑详情
	public final static String CHECKCODE_KEY="reids_code_";//验证码
	public final static String OPEN_COUNT="reids_open";
	public final static String DNS="reids_dns";
	public final static String ISWHITE="wl_";

	public final static String SHOP_ORDER_VALIDATE_CODE = "shop_order_validate_code_";
	public static final String KEY_BROADCAST_ALL_ID = "broadcast_all_id_";

	public static final String PREFIX_USER_LOTTERY_COUNT = "user_lottery_count_";

	public static final String KEY_OPEN_SUBSCRIBE_RADIO_ID = "open_subscribe_radio_id";//车载我的订阅.fm的id

	public static final String PREFIX_PLAYRECORD = "storm:playrecord:zset:";//用户收听记录前缀

	public static final String KEY_OPEN_SWITCH = "open:conf:switch:";

	public static final String KEY_KRADIO_UID = "kradio:uid:";

	/**
	 * 手机端主页热门子分类标签
	 */
	public static final String KEY_HOT_SUBCLASS_LABEL = "hot_subclass_label:";
	public static final int EXP_KEY_HOT_SUBCLASS_LABEL = 60 * 60 * 24;

	public static final String AKKA_UNCONFIRM_MSG_LIST_KEY = "ak:client:uncon:l:";
	public static final String AKKA_DEAD_MSG_LIST_KEY = "ak:client:dead:l:";
	public static final String AKKA_UNCONFIRM_MSG_KEY = "ak:client:uncon:s:";


	public static final String SEND_TO_NEW_AKKA = "newakkaisready";



    //2018-12-17后统计的redis的key


    public static final String RADIO_USER_LIST_STRING ="RADIO_USER_LIST_STRING_";

    public static final String SEEN_NEW_STRING_KEY="SEEN_NEW_STRING_KEY";

    //智能电台默认播单key
    public static final String RADIO_FIX="AI_RADIO_%s_%s";

    public static final String DBMS_SEARCH_LOCK = "search_lock";

    public static final String ACCOUNT_BIND = "ACCOUNT_BIND_";//账号绑定，缓存key前缀

    public static final String DBMS_REGISTER_LOCK = "register_lock";

    public static final String VALIDATE_CODE_REDIS_KEY_PREFIX = "valid_code_";

    public static final String AUDIONEW_LIMIT="AUDIONEW_LIMIT_";

    public static final String AUDIOBATCHNEW_LIMIT="AUDIOBATCHNEW_LIMIT_";

    public static final String PHONE_OK="phone_ok_";

    public static final String THIRDPART_LOGIN_KEY_PREFIX  = "thirdpart_login_";

    public static final String PREFIX_CODE = "o2:c:";

    public static final String PREFIX_QR = "o2:qr:";

    public static final String PREFIX_TOKEN = "o2:t:";

    public static final String PREFIX_REFRESH_TOKEN = "o2:ft:";

    public static final String PREFIX_OAUTH2 = "o2:a:";

    public static final String GROUP_QR_CODE = "redis_group_qrcode_url";

    public static final String CATEGORY_KEY = "APP_CATEGORY_%s";

	/**
	 * openSDK应用分类树
	 */
	public static final String CATEGORY_TREE_KEY = "APP_CATEGORY_TREE_%S";

	/**
	 * openSDK应用根分类
	 */
	public static final String CATEGORY_ROOT_KEY = "APP_CATEGORY_ROOT_%S";

    public static final String OFF_LINE_MESSAGE_PREFIX = "off-line message:";

    /**
     * 微信access_token缓存前缀
     */
    public static final String WECHAT_ACCESS_TOKEN_PREFIX = "wechat_access_token";


    /**
     * 微信jsapi_ticket缓存前缀
     */
    public static final String WECHAT_JSAPI_TICKET_PREFIX = "wechat_jsapi_ticket";

    public static final String DBMS_LOGIN_LOCK = "login_lock";

    //蔚来电台播单中用到的图片
    public static final String KEY_OF_WEI_LAI_IMG = "WEI_LAI_RADIO_IMG";

    public static final String OPEN_ID = "redis_openid_";

    public static final String OPEN_LOCATION_MOJI = "redis_location_moji_";

    public static final String OPEN_LOCATION = "redis_location_";

    public static final String YUNXIN_FREE_ROOM = "yunxin_free_room";

    public static final String DBMS_DOWNLOAD_LOCK = "download_lock";

    public static final String RADIO_SEEN="RADIO_SEEN_";

    public static final String RADIO="RADIO_";

    public static final String AI_RADIO_API_PUBLISH_ROLLBACK_SIGN ="AI_RADIO_API_PUBLISH_ROLLBACK_SIGN";

    public static final String KEY_OF_WHITE_NAME_NOTE = "WEI_LAI_RADIO_WHITE_NOTE";

    public static final String COUNTER = "COUNTER-";

    public static final String INSTALL ="install:";

    public static final String LIST_UDID="list:udid:";

    public static final String RADIO_FOLLOWING_NUMBER_KEY = "radio_following_num";

    public static final String DBMS_IM_LOCK = "im_lock";

    public static final String RADIO_LIKING_NUMBER_KEY = "radio_liking_num";

    public static final String LIST_LIKED_UDID="list:liked:udid:";

    public static final String LIST_LIKED_UID="list:liked:uid:";

    public static final String KEY_WECHAT_TICKET="key_wechat_ticket";

    public static final String DBMS_CONNECT_LOCK = "connect_lock";

    public static final String KAOLAFM_USERUID_UDID="kaolafm_UserUid_Udid";

    public static final String USER_TOKEN = "user:token:";

    public static final String VCODE_SUCCESS ="vcode_success:";

    public static final String USER_EXECUTE_METHOD = "user_method";

    public static final String KAOLAFM_ACTIVITY_PROGRAM_LIKECOUNT="kaolafm-activity-program-likecount";

    public static final String KEY_USER_PLAY_HISTORY_OPEN = "userPlayHistory_open";

    public static final String KEY_USER_BROADCAST_HISTORY_OPEN = "userBroadcastHistory_open";


}
