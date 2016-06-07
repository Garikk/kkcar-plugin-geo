package kkdev.kksystem.plugin.geo;

import kkdev.kksystem.base.classes.plugins.PluginInfo;
import kkdev.kksystem.base.classes.plugins.simple.IPluginInfoRequest;
import kkdev.kksystem.base.constants.PluginConsts;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author blinov_is e
 */
public class GEOPluginInfo implements IPluginInfoRequest {

    @Override
    public PluginInfo GetPluginInfo() {
        PluginInfo Ret = new PluginInfo();

        Ret.PluginName = "KKGEOProcessor";
        Ret.PluginDescription = "Basic GEO Data Decoder plugin";
        Ret.PluginVersion = 1;
        Ret.Enabled = true;
        Ret.ReceivePins = GetMyReceivePinInfo();
        Ret.TransmitPins = GetMyTransmitPinInfo();
        Ret.PluginUUID = "9c5f10b3-8a08-4432-aa29-d2aca5c0e76c";
        return Ret;
    }

    private String[] GetMyReceivePinInfo() {

        String[] Ret = new String[2];

        Ret[0] = PluginConsts.KK_PLUGIN_BASE_PIN_COMMAND;
        Ret[1] = PluginConsts.KK_PLUGIN_BASE_BASIC_TAGGEDOBJ_DATA;

        return Ret;
    }

    private String[] GetMyTransmitPinInfo() {

        String[] Ret = new String[1];
        Ret[0] = PluginConsts.KK_PLUGIN_BASE_GEO_DATA;

        return Ret;
    }

}
