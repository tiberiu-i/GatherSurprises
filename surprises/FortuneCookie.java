package surprise.surprises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import surprise.ISurprise;

public class FortuneCookie implements ISurprise {
	private static final Random random = new Random();
	private String message;
	private static final ArrayList<String> messagesArray = new ArrayList<String>(Arrays.asList(
			"\"Hard work beats talent when talent doesn't work hard.\" - Tim Notke",
			"\"Definiteness of purpose is the starting point of all achievement.\" - W. Clement Stone",
			"\"The only way to do great work is to love what you do.\" - Steve Jobs",
			"\"Există oameni care cred că pot și oameni care cred că nu pot. Ambele părți au dreptate.\" - Henry Ford",
			"\"Whether you want to uncover the secrets of the universe, or you just want to pursue a career in the 21st century, basic computer programming is an essential skill to learn.\" - Stephen Hawking",
			"\"I never lose. I either win or learn.\" - Nelson Mandela",
			"\"If you can't explain it simply, you don't understand it well enough.\" - Albert Einstein",
			"\"To say that the purpose of colleges is to provide instruction is like saying that General Motors' business is to operate assembly lines.\" - Robert Barr & John Tagg \"From Teaching to Learning\"",
			"\"Measuring programming progress by lines of code is like measuring aircraft building progress by weight.\" - Bill Gates",
			"\"Thinking is the hardest work there is, which is probably the reason why so few engage in it.\" - Henry Ford",
			"\"A dream doesn't become reality through magic; it takes sweat, determination and hard work.\" - Colin Powell",
			"\"Never mind what others do; do better than yourself, beat your own record from day to day, and you are a success.\" - William J.H. Boetcker",
			"\"Success is simple. Do what’s right, the right way, at the right time.\" - Arnold Glasow",
			"\"A mind that is stretched by a new experience can never go back to its old dimensions.\" - Oliver Wendell Holmes, Jr.",
			"\"The art and science of asking questions is the source of all knowledge.\" - Thomas Berger",
			"\"The science of today is the technology of tomorrow.\" - Edward Teller",
			"\"Success consists of going from failure to failure without loss of enthusiasm.\" - Winston Churchill",
			"\"Work as if you live in the early days of a better nation\" - Alasdair Gray",
			"\"Copiii și tinerii țării au astăzi o viață fără granițe. În fața computerelor sau călătorind pe cinci continente, fără niciun complex de inferioritate, ei sunt acea parte a României care ne așază la nivel de egalitate cu orice altă țară a lumii.\" - regele Mihai I",
			"\"I've missed more than 9000 shots in my career. I've lost almost 300 games. 26 times, I've been trusted to take the game winning shot and missed. I've failed over and over and over again in my life. And that is why I succeed.\" - Michael Jordan"));

	public FortuneCookie(String message) {
		this.message = message;
	}

	public static FortuneCookie generate() {
		return new FortuneCookie(messagesArray.get(randomNumber()));
	}

	public static int randomNumber() {
		return random.nextInt(messagesArray.size());
	}

	@Override
	public void enjoy() {
		System.out.println("You reveived a fortune cookie! " + this.message);
	}
}