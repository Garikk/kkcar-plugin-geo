package kkdev.kksystem.plugin.geo;

import kkdev.kksystem.base.classes.plugins.PluginMessage;
import kkdev.kksystem.base.classes.plugins.simple.KKPluginBase;
import kkdev.kksystem.plugin.geo.manager.GEOManager;
import kkdev.kksystem.base.interfaces.IPluginBaseConnection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author blinov_is
 */
public final class KKPlugin extends KKPluginBase {
    public KKPlugin() {
        super(new GEOPluginInfo());
        Global.GM=new GEOManager();
    }

    @Override
    public void pluginInit(IPluginBaseConnection BaseConnector, String GlobalConfUID) {
        super.pluginInit(BaseConnector, GlobalConfUID);
    //    Global.GM.Init(this);
    }

    
    @Override
    public void executePin(PluginMessage Pin) {
        super.executePin(Pin);
        Global.GM.ReceivePIN(Pin);
    }
    
    
     @Override
    public void pluginStart() {
         super.pluginStart();
       //  Global.GM.Start();
    }

}
