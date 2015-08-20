import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

/**
 * Created by WYJ on 2015-08-18.
 */
public class SubReqClientHandler extends ChannelHandlerAdapter {


    public SubReqClientHandler() {
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) {
        ctx.write(subReq(1));
        ctx.write(subReq(2));
        ctx.write(subReq(3));

        ctx.flush();
    }

    private SubscribeReq subReq(int i) {
        SubscribeReq req = new SubscribeReq();
        req.setAddress("广州");
        req.setPhoneNumber("13789765465");
        req.setProductName("Netty 权威指南");
        req.setSubReqID(i);
        req.setUserName("WYJ");
        return req;
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        SubscribeResp resp = (SubscribeResp) msg;
        System.out.println("Receive server response: [" + resp.toString() + "]");
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        ctx.flush();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }

}
