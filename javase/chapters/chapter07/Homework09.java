// 9.定义Music类，里面有音乐名name、音乐时长times属性，
// 并有播放play功能和返回本身属性信息的功能方法getlnfo.

public class Homework09{
    public static void main(String[] args){
    	Music music = new Music("月光", 3.55, 3.21);
    	music.getInfo();
    }
}
class Music{
	String name;
	double duration;
	double progress;

	//构造器
	public Music(String name, double duration, double progress){
		this.name = name;
		this.duration = duration;
		this.progress = progress;
	}

	public boolean isPlaying(){
		return progress > 0 && progress < duration;
	}

	public void getInfo(){
		if(isPlaying()){
			System.out.println("歌曲正在播放，进度是" + progress);
		}else{
			System.out.println("歌曲不在播放");
		}
		System.out.println("歌曲的名字" + name + "，时长是" + duration);
	}
}