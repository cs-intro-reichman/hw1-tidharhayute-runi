// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

		String time = " AM";
		if (hours >= 12){
			time = " PM";
		}

		if (hours > 12) {
			if (minutes < 10) {
				System.out.println((hours - 12) + ":0" + minutes + time);
			} else {
				System.out.println((hours - 12) + ":" + minutes + time);
			}
		} else {
			if (minutes < 10) {
				System.out.println(hours + ":0" + minutes + time);
			} else {
				System.out.println(hours + ":" + minutes + time);
			}
		}
	}
}