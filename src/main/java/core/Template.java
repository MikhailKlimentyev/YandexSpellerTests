package core;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class Template {
    public JsonObject json;
    public JsonObject factContent;
    public JsonObject DimensionAttributeContent;
    public JsonObject ReportTemplateRows;
    public JsonObject headerContent;
    public Header header;


    public Template(JsonObject content) {
        json = content;
        headerContent = content;
        header = new Header();
        //Fact fact = new Fact(content);
        //DimensionAttribute dimensionAttributeContent = new DimensionAttribute(content);
        //ReportTemplateRows reportTemplateRows = new ReportTemplateRows(content);
    }

    public class Header {

        public Header() {
            System.out.println("inside Header constructor in Template.Header class");
        }

        private JsonElement Id = headerContent.get("id");
        private JsonElement Name = headerContent.get("name");
        private JsonElement Description = headerContent.get("description");

        public String GetValueId(){return Id.toString();}
        public String GetValueName (){return Name.toString();}
        public String GetValueDescription (){return Description.toString();}
    }

    public class Fact {
        public Fact(JsonObject content) {
            factContent = content;
        }
        JsonElement Id = factContent.get("Id");
        JsonElement ParentId = factContent.get("parentId");
        JsonElement Dimension = factContent.get("dimension");
        JsonElement Attribute = factContent.get("attribute");
        JsonElement Translation = factContent.get("translation");
        JsonElement Type = factContent.get("type");
        JsonElement SortOrder = factContent.get("sortOrder");
        JsonElement Hierarchy = factContent.get("hierarchy");
        JsonElement Description = factContent.get("description");
        JsonElement ReportPeriodLabel = factContent.get("reportPeriodLabel");
        JsonElement AnyPeriod = factContent.get("anyPeriod");
        JsonElement NoPercent = factContent.get("noPercent");
        JsonElement NoPeriod = factContent.get("noPeriod");
        JsonElement NoTotal = factContent.get("noTotal");
        JsonElement NoFilter = factContent.get("noFilter");
        JsonElement New = factContent.get("new");

        public String GetValueValueId(){return Id.toString();}
        public String GetValueParentId (){return ParentId.toString();}
        public String GetValueDimension (){return Dimension.toString();}
        public String GetValueAttribute(){return Attribute.toString();}
        public String GetValueTranslation(){return Translation.toString();}
        public String GetValueType(){return Type.toString();}
        public String GetValueSortOrder (){return SortOrder.toString();}
        public String GetValueHierarchy(){return Hierarchy.toString();}
        public String GetValueDescription (){return Description.toString();}
        public String GetValueReportPeriodLabel (){return ReportPeriodLabel.toString();}
        public String GetValueAnyPeriod(){return AnyPeriod.toString();}
        public String GetValueNoPercent (){return NoPercent.toString();}
        public String GetValuePeriod (){return NoPeriod.toString();}
        public String GetValueNoTotal (){return NoTotal.toString();}
        public String GetValueNoFilter (){return NoFilter.toString();}
        public String GetValueNew (){return New.toString();}
    }

    public class DimensionAttribute{
        public DimensionAttribute(JsonObject content) {
            DimensionAttributeContent = content;
        }
        JsonElement Id = DimensionAttributeContent.get("Id");
        JsonElement ParentId = DimensionAttributeContent.get("parentId");
        JsonElement Dimension = DimensionAttributeContent.get("dimension");
        JsonElement Attribute = DimensionAttributeContent.get("attribute");
        JsonElement Translation = DimensionAttributeContent.get("translation");
        JsonElement Type = DimensionAttributeContent.get("type");
        JsonElement SortOrder = DimensionAttributeContent.get("sortOrder");
        JsonElement Hierarchy = DimensionAttributeContent.get("hierarchy");
        JsonElement Description = DimensionAttributeContent.get("description");
        JsonElement ReportPeriodLabel = DimensionAttributeContent.get("reportPeriodLabel");
        JsonElement AnyPeriod = DimensionAttributeContent.get("anyPeriod");
        JsonElement NoPercent = DimensionAttributeContent.get("noPercent");
        JsonElement NoPeriod = DimensionAttributeContent.get("noPeriod");
        JsonElement NoTotal = DimensionAttributeContent.get("noTotal");
        JsonElement NoFilter = DimensionAttributeContent.get("noFilter");
        JsonElement New = DimensionAttributeContent.get("new");

        public String GetValueValueId(){return Id.toString();}
        public String GetValueParentId (){return ParentId.toString();}
        public String GetValueDimension (){return Dimension.toString();}
        public String GetValueAttribute(){return Attribute.toString();}
        public String GetValueTranslation(){return Translation.toString();}
        public String GetValueType(){return Type.toString();}
        public String GetValueSortOrder (){return SortOrder.toString();}
        public String GetValueHierarchy(){return Hierarchy.toString();}
        public String GetValueDescription (){return Description.toString();}
        public String GetValueReportPeriodLabel (){return ReportPeriodLabel.toString();}
        public String GetValueAnyPeriod(){return AnyPeriod.toString();}
        public String GetValueNoPercent (){return NoPercent.toString();}
        public String GetValuePeriod (){return NoPeriod.toString();}
        public String GetValueNoTotal (){return NoTotal.toString();}
        public String GetValueNoFilter (){return NoFilter.toString();}
        public String GetValueNew (){return New.toString();}
    }

    class ReportTemplateRows {
        public ReportTemplateRows(JsonObject content) {
            ReportTemplateRows = content;
        }
    }

    class TemplateRow {
    }

    class ReportTemplateColumns {
    }

    class emplateColumn {
    }


}