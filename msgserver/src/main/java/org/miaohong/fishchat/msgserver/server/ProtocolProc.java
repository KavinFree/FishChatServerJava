package org.miaohong.fishchat.msgserver.server;

import com.alibaba.fastjson.JSON;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import org.miaohong.fishchat.libnet.protocol.Cmd;
import org.miaohong.fishchat.libnet.protocol.CmdSimple;
import org.miaohong.fishchat.log.Log;
import org.miaohong.fishchat.msgserver.config.MsgServerConfig;

import java.util.ArrayList;

/**
 * Created by haroldmiao on 2015/6/13.
 */
public class ProtocolProc {

    private MsgServerConfig mc;

    public ProtocolProc(MsgServerConfig mc) {
        this.mc = mc;
    }


    public void procSendPing(ChannelHandlerContext ctx, CmdSimple cmd) {


    }

    public void procSendClientID(ChannelHandlerContext ctx, CmdSimple cmd) {
        Log.logger.info("procSendClientID");
        String cid = cmd.getArgs().get(0);

    }

    public void procSubscribeChannel(ChannelHandlerContext ctx, CmdSimple cmd) {
    }

    public void procSendMessageP2P(ChannelHandlerContext ctx, CmdSimple cmd) {
    }

    public void procP2pAck(ChannelHandlerContext ctx, CmdSimple cmd) {
    }

    public void procSendMessageTopic(ChannelHandlerContext ctx, CmdSimple cmd) {
    }

    public void procJoinTopic(ChannelHandlerContext ctx, CmdSimple cmd) {
    }

    public void procCreateTopic(ChannelHandlerContext ctx, CmdSimple cmd) {
    }

    public void procRouteMessageP2P(ChannelHandlerContext ctx, CmdSimple cmd) {

    }
}
