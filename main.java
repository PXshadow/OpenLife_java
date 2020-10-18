import haxe.jvm.Function;
import openlife.data.object.player.PlayerInstance;
import openlife.engine.Engine;
import openlife.engine.EngineEvent;
import openlife.engine.EngineHeader;

public class main implements EngineHeader
{
    public static void main(String[] args)
    {
        new main();
    }
    void close()
    {
        System.out.println("client closed");
    }
    void playerUpdate(PlayerInstance[] instances)
    {

    }
    public main()
    {
        EngineEvent events = new EngineEvent();
        //events.playerUpdate = playerUpdate;
        Engine engine = Engine.create(this,null, null, "");
        engine.relayPort = 8005;
        engine.connect(false, true);
        System.out.println("running");
    }
    public void flip(int x, int y)
	{
    }
    public void craving(int id, int bonus)
	{
    }
    public void valley(int spacing, int offset)
	{
	}
	public void flight(int id, int x, int y)
	{
	}
	public void homeland(int x, int y, java.lang.String name)
	{
    }
	public void graveMove(int xs, int ys, int xd, int yd, boolean swapDest)
	{
    }
    public void ownerList(int x, int y, haxe.root.Array<java.lang.Object> list)
	{
        
	}
}
public class Config
{
    String ip = "bigserver2.onehouronelife.com";
}