package chatTest2;

public class Factory {

	protected BotFactory bot;
	
	public Bot makeBot() {
		return bot.makeABot();
	}
}
