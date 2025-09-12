package com.shimbhu;

public class AdapterReport implements Reports{

    private XmlReport xmlReport;

    public AdapterReport(XmlReport xmlReport){
        this.xmlReport = xmlReport;
    }

    @Override
    public String getJsonData() {
        String data = xmlReport.getXmlData();
        return "id : 1, \nname : 'Shimbhu' ";
    }
}

