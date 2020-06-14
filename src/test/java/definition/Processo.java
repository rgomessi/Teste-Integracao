package definition;

import groovy.json.internal.LazyMap;
import jdk.nashorn.api.scripting.ScriptObjectMirror;

public class Processo {
    private static String lastId;
    private static String url = "http://agapito-server.herokuapp.com/processos";
    private static LazyMap fieldsJson = new LazyMap();

    public static void setLastId(String id) {
        lastId = id;
    }

    public static String geturl() {
        return url;
    }

    public static String getLastId() {
        return lastId;
    }

    public static void clearfields() {
        fieldsJson.clear();
    }

    public static void addFields(String field, String value) {
        fieldsJson.put(field, value);
    }

    public static LazyMap getFields() {
        return fieldsJson;
    }

    }
