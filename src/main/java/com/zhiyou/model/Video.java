package com.zhiyou.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Video {
	private Integer video_id;
	private String title;
	private Integer detail;
	private String time;
	private String speaker_id;
	private String course_id;
	private String video_url;
	private String image_url;
	private String play_num;
	
}
