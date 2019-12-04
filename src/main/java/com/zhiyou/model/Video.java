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
	public Video(Integer video_id, String title, Integer detail, String time, String speaker_id, String course_id,
			String video_url, String image_url, String play_num) {
		super();
		this.video_id = video_id;
		this.title = title;
		this.detail = detail;
		this.time = time;
		this.speaker_id = speaker_id;
		this.course_id = course_id;
		this.video_url = video_url;
		this.image_url = image_url;
		this.play_num = play_num;
	}
	public Integer getVideo_id() {
		return video_id;
	}
	public void setVideo_id(Integer video_id) {
		this.video_id = video_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getDetail() {
		return detail;
	}
	public void setDetail(Integer detail) {
		this.detail = detail;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getSpeaker_id() {
		return speaker_id;
	}
	public void setSpeaker_id(String speaker_id) {
		this.speaker_id = speaker_id;
	}
	public String getCourse_id() {
		return course_id;
	}
	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}
	public String getVideo_url() {
		return video_url;
	}
	public void setVideo_url(String video_url) {
		this.video_url = video_url;
	}
	public String getImage_url() {
		return image_url;
	}
	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}
	public String getPlay_num() {
		return play_num;
	}
	public void setPlay_num(String play_num) {
		this.play_num = play_num;
	}
	public Video() {
		super();
	}
	@Override
	public String toString() {
		return "Video [video_id=" + video_id + ", title=" + title + ", detail=" + detail + ", time=" + time
				+ ", speaker_id=" + speaker_id + ", course_id=" + course_id + ", video_url=" + video_url
				+ ", image_url=" + image_url + ", play_num=" + play_num + "]";
	}
	
}
