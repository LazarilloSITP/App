package appinventor.ai_andres_murciat.Lazarillo;

import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.ListPicker;
import com.google.appinventor.components.runtime.LocationSensor;
import com.google.appinventor.components.runtime.Notifier;
import com.google.appinventor.components.runtime.TextBox;
import com.google.appinventor.components.runtime.TinyDB;
import com.google.appinventor.components.runtime.VerticalArrangement;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.runtime;
import gnu.expr.Language;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.kawa.functions.Format;
import gnu.kawa.functions.GetNamedPart;
import gnu.kawa.reflect.Invoke;
import gnu.kawa.reflect.SlotGet;
import gnu.kawa.reflect.SlotSet;
import gnu.kawa.xml.XDataType;
import gnu.lists.Consumer;
import gnu.lists.FString;
import gnu.lists.LList;
import gnu.lists.Pair;
import gnu.lists.PairWithPosition;
import gnu.lists.VoidConsumer;
import gnu.mapping.CallContext;
import gnu.mapping.Environment;
import gnu.mapping.Procedure;
import gnu.mapping.PropertySet;
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.mapping.WrongType;
import gnu.math.IntNum;
import kawa.lang.Promise;
import kawa.lib.lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;
import kawa.standard.require;

/* compiled from: AdminEst.yail */
public class AdminEst extends Form implements Runnable {
    public static AdminEst AdminEst;
    static final SimpleSymbol Lit0 = ((SimpleSymbol) new SimpleSymbol("AdminEst").readResolve());
    static final SimpleSymbol Lit1 = ((SimpleSymbol) new SimpleSymbol("getMessage").readResolve());
    static final PairWithPosition Lit10 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit158, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 65703), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 65697);
    static final SimpleSymbol Lit100 = ((SimpleSymbol) new SimpleSymbol("lbDireccion").readResolve());
    static final FString Lit101 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit102 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit103 = ((SimpleSymbol) new SimpleSymbol("btnGuardarEst").readResolve());
    static final IntNum Lit104;
    static final IntNum Lit105;
    static final FString Lit106 = new FString("com.google.appinventor.components.runtime.Button");
    static final PairWithPosition Lit107 = PairWithPosition.make(Lit158, PairWithPosition.make(Lit158, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 917613), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 917608);
    static final PairWithPosition Lit108 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit158, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 917749), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 917743);
    static final PairWithPosition Lit109 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit158, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 917873), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 917867);
    static final PairWithPosition Lit11 = PairWithPosition.make(Lit158, PairWithPosition.make(Lit158, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 65719), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 65714);
    static final SimpleSymbol Lit110 = ((SimpleSymbol) new SimpleSymbol("lsCambioEst").readResolve());
    static final SimpleSymbol Lit111 = ((SimpleSymbol) new SimpleSymbol("Latitude").readResolve());
    static final PairWithPosition Lit112 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit158, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 918001), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 917995);
    static final SimpleSymbol Lit113 = ((SimpleSymbol) new SimpleSymbol("Longitude").readResolve());
    static final PairWithPosition Lit114 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit158, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 918131), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 918125);
    static final SimpleSymbol Lit115 = ((SimpleSymbol) new SimpleSymbol("Notifier1").readResolve());
    static final SimpleSymbol Lit116 = ((SimpleSymbol) new SimpleSymbol("ShowAlert").readResolve());
    static final PairWithPosition Lit117 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 918245);
    static final PairWithPosition Lit118 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 918329);
    static final PairWithPosition Lit119 = PairWithPosition.make(Lit158, PairWithPosition.make(Lit158, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 918471), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 918466);
    static final PairWithPosition Lit12 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit158, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 65874), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 65868);
    static final PairWithPosition Lit120 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit158, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 918607), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 918601);
    static final PairWithPosition Lit121 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit158, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 918731), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 918725);
    static final PairWithPosition Lit122 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit158, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 918859), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 918853);
    static final PairWithPosition Lit123 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit158, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 918989), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 918983);
    static final PairWithPosition Lit124 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 919103);
    static final PairWithPosition Lit125 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 919187);
    static final PairWithPosition Lit126 = PairWithPosition.make(Lit158, PairWithPosition.make(Lit158, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 919329), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 919324);
    static final PairWithPosition Lit127 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit158, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 919465), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 919459);
    static final PairWithPosition Lit128 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit158, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 919589), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 919583);
    static final PairWithPosition Lit129 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit158, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 919717), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 919711);
    static final PairWithPosition Lit13 = PairWithPosition.make(Lit158, PairWithPosition.make(Lit158, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 65890), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 65885);
    static final PairWithPosition Lit130 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit158, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 919847), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 919841);
    static final PairWithPosition Lit131 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 919961);
    static final PairWithPosition Lit132 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 920076);
    static final PairWithPosition Lit133 = PairWithPosition.make(Lit4, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 920160);
    static final PairWithPosition Lit134;
    static final SimpleSymbol Lit135 = ((SimpleSymbol) new SimpleSymbol("btnGuardarEst$Click").readResolve());
    static final FString Lit136 = new FString("com.google.appinventor.components.runtime.TinyDB");
    static final FString Lit137 = new FString("com.google.appinventor.components.runtime.TinyDB");
    static final FString Lit138 = new FString("com.google.appinventor.components.runtime.LocationSensor");
    static final SimpleSymbol Lit139 = ((SimpleSymbol) new SimpleSymbol("DistanceInterval").readResolve());
    static final SimpleSymbol Lit14 = ((SimpleSymbol) new SimpleSymbol("lbNombre").readResolve());
    static final FString Lit140 = new FString("com.google.appinventor.components.runtime.LocationSensor");
    static final SimpleSymbol Lit141 = ((SimpleSymbol) new SimpleSymbol("CurrentAddress").readResolve());
    static final SimpleSymbol Lit142 = ((SimpleSymbol) new SimpleSymbol("lsCambioEst$LocationChanged").readResolve());
    static final SimpleSymbol Lit143 = ((SimpleSymbol) new SimpleSymbol("LocationChanged").readResolve());
    static final FString Lit144 = new FString("com.google.appinventor.components.runtime.Notifier");
    static final FString Lit145 = new FString("com.google.appinventor.components.runtime.Notifier");
    static final SimpleSymbol Lit146 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final SimpleSymbol Lit147 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    static final SimpleSymbol Lit148 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final SimpleSymbol Lit149 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final SimpleSymbol Lit15 = ((SimpleSymbol) new SimpleSymbol("Text").readResolve());
    static final SimpleSymbol Lit150 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit151 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final SimpleSymbol Lit152 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final SimpleSymbol Lit153 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    static final SimpleSymbol Lit154 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit155 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final SimpleSymbol Lit156 = ((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve());
    static final SimpleSymbol Lit157 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final SimpleSymbol Lit158 = ((SimpleSymbol) new SimpleSymbol("any").readResolve());
    static final PairWithPosition Lit16 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit158, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 66040), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 66034);
    static final SimpleSymbol Lit17 = ((SimpleSymbol) new SimpleSymbol("lbEmail").readResolve());
    static final PairWithPosition Lit18 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit158, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 66181), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 66175);
    static final SimpleSymbol Lit19 = ((SimpleSymbol) new SimpleSymbol("VerticalArrangement1").readResolve());
    static final SimpleSymbol Lit2 = ((SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve());
    static final SimpleSymbol Lit20 = ((SimpleSymbol) new SimpleSymbol("Visible").readResolve());
    static final SimpleSymbol Lit21 = ((SimpleSymbol) new SimpleSymbol("VerticalArrangement2").readResolve());
    static final SimpleSymbol Lit22 = ((SimpleSymbol) new SimpleSymbol("arrIngDatosAdmin").readResolve());
    static final SimpleSymbol Lit23 = ((SimpleSymbol) new SimpleSymbol("AdminEst$Initialize").readResolve());
    static final SimpleSymbol Lit24 = ((SimpleSymbol) new SimpleSymbol("Initialize").readResolve());
    static final FString Lit25 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final SimpleSymbol Lit26 = ((SimpleSymbol) new SimpleSymbol("Width").readResolve());
    static final IntNum Lit27 = IntNum.make(-2);
    static final SimpleSymbol Lit28 = ((SimpleSymbol) new SimpleSymbol("number").readResolve());
    static final FString Lit29 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final SimpleSymbol Lit3 = ((SimpleSymbol) new SimpleSymbol("AppName").readResolve());
    static final FString Lit30 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit31 = ((SimpleSymbol) new SimpleSymbol("lbDatosAdmin").readResolve());
    static final SimpleSymbol Lit32 = ((SimpleSymbol) new SimpleSymbol("FontBold").readResolve());
    static final SimpleSymbol Lit33 = ((SimpleSymbol) new SimpleSymbol("FontTypeface").readResolve());
    static final IntNum Lit34 = IntNum.make(1);
    static final SimpleSymbol Lit35 = ((SimpleSymbol) new SimpleSymbol("TextAlignment").readResolve());
    static final FString Lit36 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit37 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final SimpleSymbol Lit38 = ((SimpleSymbol) new SimpleSymbol("txtNombre").readResolve());
    static final SimpleSymbol Lit39 = ((SimpleSymbol) new SimpleSymbol("Hint").readResolve());
    static final SimpleSymbol Lit4;
    static final FString Lit40 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final FString Lit41 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final SimpleSymbol Lit42 = ((SimpleSymbol) new SimpleSymbol("txtEmail").readResolve());
    static final FString Lit43 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final FString Lit44 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit45 = ((SimpleSymbol) new SimpleSymbol("btnGuardarDatos").readResolve());
    static final SimpleSymbol Lit46 = ((SimpleSymbol) new SimpleSymbol("BackgroundColor").readResolve());
    static final IntNum Lit47;
    static final SimpleSymbol Lit48 = ((SimpleSymbol) new SimpleSymbol("Shape").readResolve());
    static final SimpleSymbol Lit49 = ((SimpleSymbol) new SimpleSymbol("TextColor").readResolve());
    static final SimpleSymbol Lit5 = ((SimpleSymbol) new SimpleSymbol("Scrollable").readResolve());
    static final IntNum Lit50;
    static final FString Lit51 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit52 = ((SimpleSymbol) new SimpleSymbol("StoreValue").readResolve());
    static final PairWithPosition Lit53 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit158, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 315516), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 315510);
    static final PairWithPosition Lit54 = PairWithPosition.make(Lit4, PairWithPosition.make(Lit158, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 315639), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 315633);
    static final SimpleSymbol Lit55 = ((SimpleSymbol) new SimpleSymbol("btnGuardarDatos$Click").readResolve());
    static final SimpleSymbol Lit56 = ((SimpleSymbol) new SimpleSymbol("Click").readResolve());
    static final FString Lit57 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final FString Lit58 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final FString Lit59 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit6 = ((SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve());
    static final FString Lit60 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit61 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit62 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit63 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit64 = ((SimpleSymbol) new SimpleSymbol("btnEditarDatos").readResolve());
    static final SimpleSymbol Lit65 = ((SimpleSymbol) new SimpleSymbol("ShowFeedback").readResolve());
    static final IntNum Lit66;
    static final FString Lit67 = new FString("com.google.appinventor.components.runtime.Button");
    static final SimpleSymbol Lit68 = ((SimpleSymbol) new SimpleSymbol("btnEditarDatos$Click").readResolve());
    static final FString Lit69 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final SimpleSymbol Lit7 = ((SimpleSymbol) new SimpleSymbol("Title").readResolve());
    static final FString Lit70 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    static final FString Lit71 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit72 = ((SimpleSymbol) new SimpleSymbol("Label1").readResolve());
    static final FString Lit73 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit74 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit75 = ((SimpleSymbol) new SimpleSymbol("Label2").readResolve());
    static final FString Lit76 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit77 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final SimpleSymbol Lit78 = ((SimpleSymbol) new SimpleSymbol("TextBox1").readResolve());
    static final IntNum Lit79;
    static final SimpleSymbol Lit8 = ((SimpleSymbol) new SimpleSymbol("TinyDB1").readResolve());
    static final SimpleSymbol Lit80 = ((SimpleSymbol) new SimpleSymbol("Enabled").readResolve());
    static final SimpleSymbol Lit81 = ((SimpleSymbol) new SimpleSymbol("Height").readResolve());
    static final SimpleSymbol Lit82 = ((SimpleSymbol) new SimpleSymbol("MultiLine").readResolve());
    static final FString Lit83 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final FString Lit84 = new FString("com.google.appinventor.components.runtime.ListPicker");
    static final SimpleSymbol Lit85 = ((SimpleSymbol) new SimpleSymbol("lpEstaciones").readResolve());
    static final IntNum Lit86 = IntNum.make((int) Component.COLOR_NONE);
    static final SimpleSymbol Lit87 = ((SimpleSymbol) new SimpleSymbol("ElementsFromString").readResolve());
    static final SimpleSymbol Lit88 = ((SimpleSymbol) new SimpleSymbol("Selection").readResolve());
    static final IntNum Lit89 = IntNum.make(0);
    static final SimpleSymbol Lit9 = ((SimpleSymbol) new SimpleSymbol("GetValue").readResolve());
    static final FString Lit90 = new FString("com.google.appinventor.components.runtime.ListPicker");
    static final SimpleSymbol Lit91 = ((SimpleSymbol) new SimpleSymbol("lpEstaciones$AfterPicking").readResolve());
    static final SimpleSymbol Lit92 = ((SimpleSymbol) new SimpleSymbol("AfterPicking").readResolve());
    static final FString Lit93 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final SimpleSymbol Lit94 = ((SimpleSymbol) new SimpleSymbol("txtAliasEst").readResolve());
    static final FString Lit95 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final FString Lit96 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final SimpleSymbol Lit97 = ((SimpleSymbol) new SimpleSymbol("txtNombreEst").readResolve());
    static final FString Lit98 = new FString("com.google.appinventor.components.runtime.TextBox");
    static final FString Lit99 = new FString("com.google.appinventor.components.runtime.Label");
    static final ModuleMethod lambda$Fn1 = null;
    static final ModuleMethod lambda$Fn10 = null;
    static final ModuleMethod lambda$Fn11 = null;
    static final ModuleMethod lambda$Fn12 = null;
    static final ModuleMethod lambda$Fn13 = null;
    static final ModuleMethod lambda$Fn14 = null;
    static final ModuleMethod lambda$Fn15 = null;
    static final ModuleMethod lambda$Fn16 = null;
    static final ModuleMethod lambda$Fn17 = null;
    static final ModuleMethod lambda$Fn18 = null;
    static final ModuleMethod lambda$Fn19 = null;
    static final ModuleMethod lambda$Fn2 = null;
    static final ModuleMethod lambda$Fn20 = null;
    static final ModuleMethod lambda$Fn21 = null;
    static final ModuleMethod lambda$Fn22 = null;
    static final ModuleMethod lambda$Fn23 = null;
    static final ModuleMethod lambda$Fn24 = null;
    static final ModuleMethod lambda$Fn25 = null;
    static final ModuleMethod lambda$Fn26 = null;
    static final ModuleMethod lambda$Fn27 = null;
    static final ModuleMethod lambda$Fn28 = null;
    static final ModuleMethod lambda$Fn29 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn30 = null;
    static final ModuleMethod lambda$Fn31 = null;
    static final ModuleMethod lambda$Fn32 = null;
    static final ModuleMethod lambda$Fn33 = null;
    static final ModuleMethod lambda$Fn34 = null;
    static final ModuleMethod lambda$Fn35 = null;
    static final ModuleMethod lambda$Fn36 = null;
    static final ModuleMethod lambda$Fn37 = null;
    static final ModuleMethod lambda$Fn38 = null;
    static final ModuleMethod lambda$Fn39 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn40 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public final ModuleMethod AdminEst$Initialize;
    public Label Label1;
    public Label Label2;
    public Notifier Notifier1;
    public TextBox TextBox1;
    public TinyDB TinyDB1;
    public VerticalArrangement VerticalArrangement1;
    public VerticalArrangement VerticalArrangement2;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public VerticalArrangement arrIngDatosAdmin;
    public Button btnEditarDatos;
    public final ModuleMethod btnEditarDatos$Click;
    public Button btnGuardarDatos;
    public final ModuleMethod btnGuardarDatos$Click;
    public Button btnGuardarEst;
    public final ModuleMethod btnGuardarEst$Click;
    public LList components$Mnto$Mncreate;
    public final ModuleMethod dispatchEvent;
    public LList events$Mnto$Mnregister;
    public LList form$Mndo$Mnafter$Mncreation;
    public Environment form$Mnenvironment;
    public Symbol form$Mnname$Mnsymbol;
    public Environment global$Mnvar$Mnenvironment;
    public LList global$Mnvars$Mnto$Mncreate;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public Label lbDatosAdmin;
    public Label lbDireccion;
    public Label lbEmail;
    public Label lbNombre;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public ListPicker lpEstaciones;
    public final ModuleMethod lpEstaciones$AfterPicking;
    public LocationSensor lsCambioEst;
    public final ModuleMethod lsCambioEst$LocationChanged;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;
    public TextBox txtAliasEst;
    public TextBox txtEmail;
    public TextBox txtNombre;
    public TextBox txtNombreEst;

    /* compiled from: AdminEst.yail */
    public class frame extends ModuleBody {
        AdminEst $main = this;

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 1:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 3:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 5:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 10:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 11:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 12:
                    if (!(obj instanceof AdminEst)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                default:
                    return super.match1(moduleMethod, obj, callContext);
            }
        }

        public int match2(ModuleMethod moduleMethod, Object obj, Object obj2, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 2:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 3:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 6:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 7:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 9:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 14:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                default:
                    return super.match2(moduleMethod, obj, obj2, callContext);
            }
        }

        public int match4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 8:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                case 13:
                    if (!(obj instanceof AdminEst)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    if (!(obj2 instanceof Component)) {
                        return -786430;
                    }
                    callContext.value2 = obj2;
                    if (!(obj3 instanceof String)) {
                        return -786429;
                    }
                    callContext.value3 = obj3;
                    if (!(obj4 instanceof String)) {
                        return -786428;
                    }
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                case 61:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                default:
                    return super.match4(moduleMethod, obj, obj2, obj3, obj4, callContext);
            }
        }

        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            switch (moduleMethod.selector) {
                case 1:
                    this.$main.androidLogForm(obj);
                    return Values.empty;
                case 3:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj);
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "lookup-in-form-environment", 1, obj);
                    }
                case 5:
                    try {
                        return this.$main.isBoundInFormEnvironment((Symbol) obj) ? Boolean.TRUE : Boolean.FALSE;
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "is-bound-in-form-environment", 1, obj);
                    }
                case 10:
                    this.$main.addToFormDoAfterCreation(obj);
                    return Values.empty;
                case 11:
                    this.$main.sendError(obj);
                    return Values.empty;
                case 12:
                    this.$main.processException(obj);
                    return Values.empty;
                default:
                    return super.apply1(moduleMethod, obj);
            }
        }

        public Object apply4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4) {
            switch (moduleMethod.selector) {
                case 8:
                    this.$main.addToComponents(obj, obj2, obj3, obj4);
                    return Values.empty;
                case 13:
                    try {
                        try {
                            try {
                                try {
                                    return this.$main.dispatchEvent((Component) obj, (String) obj2, (String) obj3, (Object[]) obj4) ? Boolean.TRUE : Boolean.FALSE;
                                } catch (ClassCastException e) {
                                    throw new WrongType(e, "dispatchEvent", 4, obj4);
                                }
                            } catch (ClassCastException e2) {
                                throw new WrongType(e2, "dispatchEvent", 3, obj3);
                            }
                        } catch (ClassCastException e22) {
                            throw new WrongType(e22, "dispatchEvent", 2, obj2);
                        }
                    } catch (ClassCastException e222) {
                        throw new WrongType(e222, "dispatchEvent", 1, obj);
                    }
                case 61:
                    return this.$main.lsCambioEst$LocationChanged(obj, obj2, obj3, obj4);
                default:
                    return super.apply4(moduleMethod, obj, obj2, obj3, obj4);
            }
        }

        public Object apply2(ModuleMethod moduleMethod, Object obj, Object obj2) {
            switch (moduleMethod.selector) {
                case 2:
                    try {
                        this.$main.addToFormEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "add-to-form-environment", 1, obj);
                    }
                case 3:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj, obj2);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case 6:
                    try {
                        this.$main.addToGlobalVarEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e22) {
                        throw new WrongType(e22, "add-to-global-var-environment", 1, obj);
                    }
                case 7:
                    this.$main.addToEvents(obj, obj2);
                    return Values.empty;
                case 9:
                    this.$main.addToGlobalVars(obj, obj2);
                    return Values.empty;
                case 14:
                    return this.$main.lookupHandler(obj, obj2);
                default:
                    return super.apply2(moduleMethod, obj, obj2);
            }
        }

        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case 15:
                    return AdminEst.lambda2();
                case 16:
                    this.$main.$define();
                    return Values.empty;
                case 17:
                    return AdminEst.lambda3();
                case 18:
                    return AdminEst.lambda4();
                case 19:
                    return AdminEst.lambda5();
                case 20:
                    return this.$main.AdminEst$Initialize();
                case 21:
                    return AdminEst.lambda6();
                case 22:
                    return AdminEst.lambda7();
                case 23:
                    return AdminEst.lambda8();
                case 24:
                    return AdminEst.lambda9();
                case 25:
                    return AdminEst.lambda10();
                case 26:
                    return AdminEst.lambda11();
                case 27:
                    return AdminEst.lambda12();
                case 28:
                    return AdminEst.lambda13();
                case 29:
                    return AdminEst.lambda14();
                case 30:
                    return AdminEst.lambda15();
                case 31:
                    return this.$main.btnGuardarDatos$Click();
                case 32:
                    return AdminEst.lambda16();
                case 33:
                    return AdminEst.lambda17();
                case 34:
                    return AdminEst.lambda18();
                case 35:
                    return AdminEst.lambda19();
                case 36:
                    return AdminEst.lambda20();
                case 37:
                    return AdminEst.lambda21();
                case 38:
                    return AdminEst.lambda22();
                case 39:
                    return AdminEst.lambda23();
                case 40:
                    return this.$main.btnEditarDatos$Click();
                case 41:
                    return AdminEst.lambda24();
                case XDataType.NMTOKEN_TYPE_CODE /*42*/:
                    return AdminEst.lambda25();
                case XDataType.NAME_TYPE_CODE /*43*/:
                    return AdminEst.lambda26();
                case XDataType.NCNAME_TYPE_CODE /*44*/:
                    return AdminEst.lambda27();
                case XDataType.ID_TYPE_CODE /*45*/:
                    return AdminEst.lambda28();
                case XDataType.IDREF_TYPE_CODE /*46*/:
                    return AdminEst.lambda29();
                case XDataType.ENTITY_TYPE_CODE /*47*/:
                    return AdminEst.lambda30();
                case 48:
                    return AdminEst.lambda31();
                case 49:
                    return this.$main.lpEstaciones$AfterPicking();
                case 50:
                    return AdminEst.lambda32();
                case 51:
                    return AdminEst.lambda33();
                case 52:
                    return AdminEst.lambda34();
                case 53:
                    return AdminEst.lambda35();
                case 54:
                    return AdminEst.lambda36();
                case 55:
                    return AdminEst.lambda37();
                case 56:
                    return AdminEst.lambda38();
                case 57:
                    return AdminEst.lambda39();
                case 58:
                    return this.$main.btnGuardarEst$Click();
                case 59:
                    return AdminEst.lambda40();
                case 60:
                    return AdminEst.lambda41();
                default:
                    return super.apply0(moduleMethod);
            }
        }

        public int match0(ModuleMethod moduleMethod, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 15:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 16:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 17:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 18:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 19:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 20:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 21:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 22:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 23:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 24:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 25:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 26:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 27:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 28:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 29:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 30:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 31:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 32:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 33:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 34:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 35:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 36:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 37:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 38:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 39:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 40:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 41:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.NMTOKEN_TYPE_CODE /*42*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.NAME_TYPE_CODE /*43*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.NCNAME_TYPE_CODE /*44*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.ID_TYPE_CODE /*45*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.IDREF_TYPE_CODE /*46*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case XDataType.ENTITY_TYPE_CODE /*47*/:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 48:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 49:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 50:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 51:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 52:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 53:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 54:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 55:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 56:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 57:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 58:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 59:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 60:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }
    }

    static {
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit4 = simpleSymbol;
        Lit134 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/AdminEst.yail", 920272);
        int[] iArr = new int[2];
        iArr[0] = -1;
        Lit105 = IntNum.make(iArr);
        iArr = new int[2];
        iArr[0] = Component.COLOR_GRAY;
        Lit104 = IntNum.make(iArr);
        iArr = new int[2];
        iArr[0] = Component.COLOR_LTGRAY;
        Lit79 = IntNum.make(iArr);
        iArr = new int[2];
        iArr[0] = Component.COLOR_BLUE;
        Lit66 = IntNum.make(iArr);
        iArr = new int[2];
        iArr[0] = -1;
        Lit50 = IntNum.make(iArr);
        iArr = new int[2];
        iArr[0] = Component.COLOR_GRAY;
        Lit47 = IntNum.make(iArr);
    }

    public AdminEst() {
        ModuleInfo.register(this);
        ModuleBody appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame = new frame();
        this.android$Mnlog$Mnform = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 1, Lit146, 4097);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 2, Lit147, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 3, Lit148, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 5, Lit149, 4097);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 6, Lit150, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 7, Lit151, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 8, Lit152, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 9, Lit153, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 10, Lit154, 4097);
        this.send$Mnerror = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 11, Lit155, 4097);
        this.process$Mnexception = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 12, "process-exception", 4097);
        this.dispatchEvent = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 13, Lit156, 16388);
        this.lookup$Mnhandler = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 14, Lit157, 8194);
        PropertySet moduleMethod = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 15, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime4225462389548583421.scm:552");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 16, "$define", 0);
        lambda$Fn2 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 17, null, 0);
        lambda$Fn3 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 18, null, 0);
        lambda$Fn4 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 19, null, 0);
        this.AdminEst$Initialize = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 20, Lit23, 0);
        lambda$Fn5 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 21, null, 0);
        lambda$Fn6 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 22, null, 0);
        lambda$Fn7 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 23, null, 0);
        lambda$Fn8 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 24, null, 0);
        lambda$Fn9 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 25, null, 0);
        lambda$Fn10 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 26, null, 0);
        lambda$Fn11 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 27, null, 0);
        lambda$Fn12 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 28, null, 0);
        lambda$Fn13 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 29, null, 0);
        lambda$Fn14 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 30, null, 0);
        this.btnGuardarDatos$Click = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 31, Lit55, 0);
        lambda$Fn15 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 32, null, 0);
        lambda$Fn16 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 33, null, 0);
        lambda$Fn17 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 34, null, 0);
        lambda$Fn18 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 35, null, 0);
        lambda$Fn19 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 36, null, 0);
        lambda$Fn20 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 37, null, 0);
        lambda$Fn21 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 38, null, 0);
        lambda$Fn22 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 39, null, 0);
        this.btnEditarDatos$Click = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 40, Lit68, 0);
        lambda$Fn23 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 41, null, 0);
        lambda$Fn24 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 42, null, 0);
        lambda$Fn25 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 43, null, 0);
        lambda$Fn26 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 44, null, 0);
        lambda$Fn27 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 45, null, 0);
        lambda$Fn28 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 46, null, 0);
        lambda$Fn29 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 47, null, 0);
        lambda$Fn30 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 48, null, 0);
        this.lpEstaciones$AfterPicking = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 49, Lit91, 0);
        lambda$Fn31 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 50, null, 0);
        lambda$Fn32 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 51, null, 0);
        lambda$Fn33 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 52, null, 0);
        lambda$Fn34 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 53, null, 0);
        lambda$Fn35 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 54, null, 0);
        lambda$Fn36 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 55, null, 0);
        lambda$Fn37 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 56, null, 0);
        lambda$Fn38 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 57, null, 0);
        this.btnGuardarEst$Click = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 58, Lit135, 0);
        lambda$Fn39 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 59, null, 0);
        lambda$Fn40 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 60, null, 0);
        this.lsCambioEst$LocationChanged = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_AdminEst_frame, 61, Lit142, 16388);
    }

    public Object lookupInFormEnvironment(Symbol symbol) {
        return lookupInFormEnvironment(symbol, Boolean.FALSE);
    }

    public void run() {
        Throwable th;
        CallContext instance = CallContext.getInstance();
        Consumer consumer = instance.consumer;
        instance.consumer = VoidConsumer.instance;
        try {
            run(instance);
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        ModuleBody.runCleanup(instance, th, consumer);
    }

    public final void run(CallContext $ctx) {
        Consumer $result = $ctx.consumer;
        Object find = require.find("com.google.youngandroid.runtime");
        try {
            String str;
            ((Runnable) find).run();
            this.$Stdebug$Mnform$St = Boolean.FALSE;
            this.form$Mnenvironment = Environment.make(misc.symbol$To$String(Lit0));
            FString stringAppend = strings.stringAppend(misc.symbol$To$String(Lit0), "-global-vars");
            if (stringAppend == null) {
                str = null;
            } else {
                str = stringAppend.toString();
            }
            this.global$Mnvar$Mnenvironment = Environment.make(str);
            AdminEst = null;
            this.form$Mnname$Mnsymbol = Lit0;
            this.events$Mnto$Mnregister = LList.Empty;
            this.components$Mnto$Mncreate = LList.Empty;
            this.global$Mnvars$Mnto$Mncreate = LList.Empty;
            this.form$Mndo$Mnafter$Mncreation = LList.Empty;
            find = require.find("com.google.youngandroid.runtime");
            try {
                ((Runnable) find).run();
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "LazarilloSITPV1", Lit4);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit5, Boolean.TRUE, Lit6);
                    Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit7, "Admin ", Lit4), $result);
                } else {
                    addToFormDoAfterCreation(new Promise(lambda$Fn2));
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit23, this.AdminEst$Initialize);
                } else {
                    addToFormEnvironment(Lit23, this.AdminEst$Initialize);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "AdminEst", "Initialize");
                } else {
                    addToEvents(Lit0, Lit24);
                }
                this.arrIngDatosAdmin = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit25, Lit22, lambda$Fn5), $result);
                } else {
                    addToComponents(Lit0, Lit29, Lit22, lambda$Fn6);
                }
                this.lbDatosAdmin = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit22, Lit30, Lit31, lambda$Fn7), $result);
                } else {
                    addToComponents(Lit22, Lit36, Lit31, lambda$Fn8);
                }
                this.txtNombre = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit22, Lit37, Lit38, lambda$Fn9), $result);
                } else {
                    addToComponents(Lit22, Lit40, Lit38, lambda$Fn10);
                }
                this.txtEmail = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit22, Lit41, Lit42, lambda$Fn11), $result);
                } else {
                    addToComponents(Lit22, Lit43, Lit42, lambda$Fn12);
                }
                this.btnGuardarDatos = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit22, Lit44, Lit45, lambda$Fn13), $result);
                } else {
                    addToComponents(Lit22, Lit51, Lit45, lambda$Fn14);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit55, this.btnGuardarDatos$Click);
                } else {
                    addToFormEnvironment(Lit55, this.btnGuardarDatos$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "btnGuardarDatos", "Click");
                } else {
                    addToEvents(Lit45, Lit56);
                }
                this.VerticalArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit57, Lit19, lambda$Fn15), $result);
                } else {
                    addToComponents(Lit0, Lit58, Lit19, lambda$Fn16);
                }
                this.lbNombre = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit19, Lit59, Lit14, lambda$Fn17), $result);
                } else {
                    addToComponents(Lit19, Lit60, Lit14, lambda$Fn18);
                }
                this.lbEmail = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit19, Lit61, Lit17, lambda$Fn19), $result);
                } else {
                    addToComponents(Lit19, Lit62, Lit17, lambda$Fn20);
                }
                this.btnEditarDatos = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit19, Lit63, Lit64, lambda$Fn21), $result);
                } else {
                    addToComponents(Lit19, Lit67, Lit64, lambda$Fn22);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit68, this.btnEditarDatos$Click);
                } else {
                    addToFormEnvironment(Lit68, this.btnEditarDatos$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "btnEditarDatos", "Click");
                } else {
                    addToEvents(Lit64, Lit56);
                }
                this.VerticalArrangement2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit69, Lit21, lambda$Fn23), $result);
                } else {
                    addToComponents(Lit0, Lit70, Lit21, lambda$Fn24);
                }
                this.Label1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit21, Lit71, Lit72, lambda$Fn25), $result);
                } else {
                    addToComponents(Lit21, Lit73, Lit72, lambda$Fn26);
                }
                this.Label2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit21, Lit74, Lit75, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit21, Lit76, Lit75, Boolean.FALSE);
                }
                this.TextBox1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit21, Lit77, Lit78, lambda$Fn27), $result);
                } else {
                    addToComponents(Lit21, Lit83, Lit78, lambda$Fn28);
                }
                this.lpEstaciones = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit21, Lit84, Lit85, lambda$Fn29), $result);
                } else {
                    addToComponents(Lit21, Lit90, Lit85, lambda$Fn30);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit91, this.lpEstaciones$AfterPicking);
                } else {
                    addToFormEnvironment(Lit91, this.lpEstaciones$AfterPicking);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "lpEstaciones", "AfterPicking");
                } else {
                    addToEvents(Lit85, Lit92);
                }
                this.txtAliasEst = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit21, Lit93, Lit94, lambda$Fn31), $result);
                } else {
                    addToComponents(Lit21, Lit95, Lit94, lambda$Fn32);
                }
                this.txtNombreEst = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit21, Lit96, Lit97, lambda$Fn33), $result);
                } else {
                    addToComponents(Lit21, Lit98, Lit97, lambda$Fn34);
                }
                this.lbDireccion = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit21, Lit99, Lit100, lambda$Fn35), $result);
                } else {
                    addToComponents(Lit21, Lit101, Lit100, lambda$Fn36);
                }
                this.btnGuardarEst = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit21, Lit102, Lit103, lambda$Fn37), $result);
                } else {
                    addToComponents(Lit21, Lit106, Lit103, lambda$Fn38);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit135, this.btnGuardarEst$Click);
                } else {
                    addToFormEnvironment(Lit135, this.btnGuardarEst$Click);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "btnGuardarEst", "Click");
                } else {
                    addToEvents(Lit103, Lit56);
                }
                this.TinyDB1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit136, Lit8, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit137, Lit8, Boolean.FALSE);
                }
                this.lsCambioEst = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit138, Lit110, lambda$Fn39), $result);
                } else {
                    addToComponents(Lit0, Lit140, Lit110, lambda$Fn40);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit142, this.lsCambioEst$LocationChanged);
                } else {
                    addToFormEnvironment(Lit142, this.lsCambioEst$LocationChanged);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "lsCambioEst", "LocationChanged");
                } else {
                    addToEvents(Lit110, Lit143);
                }
                this.Notifier1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit144, Lit115, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit145, Lit115, Boolean.FALSE);
                }
                runtime.initRuntime();
            } catch (ClassCastException e) {
                throw new WrongType(e, "java.lang.Runnable.run()", 1, find);
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "java.lang.Runnable.run()", 1, find);
        }
    }

    static Object lambda3() {
        runtime.setAndCoerceProperty$Ex(Lit0, Lit3, "LazarilloSITPV1", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit5, Boolean.TRUE, Lit6);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit7, "Admin ", Lit4);
    }

    public Object AdminEst$Initialize() {
        runtime.setThisForm();
        if (runtime.processAndDelayed$V(new Object[]{lambda$Fn3, lambda$Fn4}) == Boolean.FALSE) {
            return runtime.setAndCoerceProperty$Ex(Lit22, Lit20, Boolean.TRUE, Lit6);
        }
        runtime.setAndCoerceProperty$Ex(Lit14, Lit15, runtime.callComponentMethod(Lit8, Lit9, LList.list2("NombreAdmin", ""), Lit16), Lit4);
        runtime.setAndCoerceProperty$Ex(Lit17, Lit15, runtime.callComponentMethod(Lit8, Lit9, LList.list2("CorreoAdmin", ""), Lit18), Lit4);
        runtime.setAndCoerceProperty$Ex(Lit19, Lit20, Boolean.TRUE, Lit6);
        return runtime.setAndCoerceProperty$Ex(Lit21, Lit20, Boolean.TRUE, Lit6);
    }

    static Object lambda4() {
        return runtime.callYailPrimitive(runtime.yail$Mnnot$Mnequal$Qu, LList.list2(runtime.callComponentMethod(Lit8, Lit9, LList.list2("NombreAdmin", ""), Lit10), ""), Lit11, "=");
    }

    static Object lambda5() {
        return runtime.callYailPrimitive(runtime.yail$Mnnot$Mnequal$Qu, LList.list2(runtime.callComponentMethod(Lit8, Lit9, LList.list2("CorreoAdmin", ""), Lit12), ""), Lit13, "=");
    }

    static Object lambda6() {
        runtime.setAndCoerceProperty$Ex(Lit22, Lit26, Lit27, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit22, Lit20, Boolean.FALSE, Lit6);
    }

    static Object lambda7() {
        runtime.setAndCoerceProperty$Ex(Lit22, Lit26, Lit27, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit22, Lit20, Boolean.FALSE, Lit6);
    }

    static Object lambda8() {
        runtime.setAndCoerceProperty$Ex(Lit31, Lit32, Boolean.TRUE, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit31, Lit33, Lit34, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit31, Lit26, Lit27, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit31, Lit15, "Datos del Administrador", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit31, Lit35, Lit34, Lit28);
    }

    static Object lambda9() {
        runtime.setAndCoerceProperty$Ex(Lit31, Lit32, Boolean.TRUE, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit31, Lit33, Lit34, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit31, Lit26, Lit27, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit31, Lit15, "Datos del Administrador", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit31, Lit35, Lit34, Lit28);
    }

    static Object lambda10() {
        runtime.setAndCoerceProperty$Ex(Lit38, Lit26, Lit27, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit38, Lit39, "Nombre Completo", Lit4);
    }

    static Object lambda11() {
        runtime.setAndCoerceProperty$Ex(Lit38, Lit26, Lit27, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit38, Lit39, "Nombre Completo", Lit4);
    }

    static Object lambda12() {
        runtime.setAndCoerceProperty$Ex(Lit42, Lit26, Lit27, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit42, Lit39, "Correo Electrónico", Lit4);
    }

    static Object lambda13() {
        runtime.setAndCoerceProperty$Ex(Lit42, Lit26, Lit27, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit42, Lit39, "Correo Electrónico", Lit4);
    }

    static Object lambda14() {
        runtime.setAndCoerceProperty$Ex(Lit45, Lit46, Lit47, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit45, Lit32, Boolean.TRUE, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit45, Lit26, Lit27, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit45, Lit48, Lit34, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit45, Lit15, "Guardar Datos", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit45, Lit49, Lit50, Lit28);
    }

    static Object lambda15() {
        runtime.setAndCoerceProperty$Ex(Lit45, Lit46, Lit47, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit45, Lit32, Boolean.TRUE, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit45, Lit26, Lit27, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit45, Lit48, Lit34, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit45, Lit15, "Guardar Datos", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit45, Lit49, Lit50, Lit28);
    }

    public Object btnGuardarDatos$Click() {
        runtime.setThisForm();
        runtime.callComponentMethod(Lit8, Lit52, LList.list2("NombreAdmin", runtime.getProperty$1(Lit38, Lit15)), Lit53);
        runtime.callComponentMethod(Lit8, Lit52, LList.list2("CorreoAdmin", runtime.getProperty$1(Lit42, Lit15)), Lit54);
        runtime.setAndCoerceProperty$Ex(Lit14, Lit15, runtime.getProperty$1(Lit38, Lit15), Lit4);
        runtime.setAndCoerceProperty$Ex(Lit17, Lit15, runtime.getProperty$1(Lit42, Lit15), Lit4);
        runtime.setAndCoerceProperty$Ex(Lit22, Lit20, Boolean.FALSE, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit19, Lit20, Boolean.TRUE, Lit6);
        return runtime.setAndCoerceProperty$Ex(Lit21, Lit20, Boolean.TRUE, Lit6);
    }

    static Object lambda16() {
        runtime.setAndCoerceProperty$Ex(Lit19, Lit26, Lit27, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit19, Lit20, Boolean.FALSE, Lit6);
    }

    static Object lambda17() {
        runtime.setAndCoerceProperty$Ex(Lit19, Lit26, Lit27, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit19, Lit20, Boolean.FALSE, Lit6);
    }

    static Object lambda18() {
        runtime.setAndCoerceProperty$Ex(Lit14, Lit32, Boolean.TRUE, Lit6);
        return runtime.setAndCoerceProperty$Ex(Lit14, Lit15, "AAAAA", Lit4);
    }

    static Object lambda19() {
        runtime.setAndCoerceProperty$Ex(Lit14, Lit32, Boolean.TRUE, Lit6);
        return runtime.setAndCoerceProperty$Ex(Lit14, Lit15, "AAAAA", Lit4);
    }

    static Object lambda20() {
        return runtime.setAndCoerceProperty$Ex(Lit17, Lit15, "EEEE", Lit4);
    }

    static Object lambda21() {
        return runtime.setAndCoerceProperty$Ex(Lit17, Lit15, "EEEE", Lit4);
    }

    static Object lambda22() {
        runtime.setAndCoerceProperty$Ex(Lit64, Lit48, Lit34, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit64, Lit65, Boolean.FALSE, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit64, Lit15, "Editar datos", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit64, Lit49, Lit66, Lit28);
    }

    static Object lambda23() {
        runtime.setAndCoerceProperty$Ex(Lit64, Lit48, Lit34, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit64, Lit65, Boolean.FALSE, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit64, Lit15, "Editar datos", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit64, Lit49, Lit66, Lit28);
    }

    public Object btnEditarDatos$Click() {
        runtime.setThisForm();
        runtime.setAndCoerceProperty$Ex(Lit38, Lit15, runtime.getProperty$1(Lit14, Lit15), Lit4);
        runtime.setAndCoerceProperty$Ex(Lit42, Lit15, runtime.getProperty$1(Lit17, Lit15), Lit4);
        runtime.setAndCoerceProperty$Ex(Lit19, Lit20, Boolean.FALSE, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit21, Lit20, Boolean.FALSE, Lit6);
        return runtime.setAndCoerceProperty$Ex(Lit22, Lit20, Boolean.TRUE, Lit6);
    }

    static Object lambda24() {
        runtime.setAndCoerceProperty$Ex(Lit21, Lit26, Lit27, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit21, Lit20, Boolean.FALSE, Lit6);
    }

    static Object lambda25() {
        runtime.setAndCoerceProperty$Ex(Lit21, Lit26, Lit27, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit21, Lit20, Boolean.FALSE, Lit6);
    }

    static Object lambda26() {
        runtime.setAndCoerceProperty$Ex(Lit72, Lit32, Boolean.TRUE, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit72, Lit26, Lit27, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit72, Lit15, "Edición de Estaciones", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit72, Lit35, Lit34, Lit28);
    }

    static Object lambda27() {
        runtime.setAndCoerceProperty$Ex(Lit72, Lit32, Boolean.TRUE, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit72, Lit26, Lit27, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit72, Lit15, "Edición de Estaciones", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit72, Lit35, Lit34, Lit28);
    }

    static Object lambda28() {
        runtime.setAndCoerceProperty$Ex(Lit78, Lit46, Lit79, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit78, Lit80, Boolean.FALSE, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit78, Lit81, Lit27, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit78, Lit26, Lit27, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit78, Lit39, "Hint for TextBox1", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit78, Lit82, Boolean.TRUE, Lit6);
        return runtime.setAndCoerceProperty$Ex(Lit78, Lit15, "Es necesario que te dirijas fisicamente a la estación de SITP que deseas configurar como frecuente para el uso de tu apadrinado invidente.", Lit4);
    }

    static Object lambda29() {
        runtime.setAndCoerceProperty$Ex(Lit78, Lit46, Lit79, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit78, Lit80, Boolean.FALSE, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit78, Lit81, Lit27, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit78, Lit26, Lit27, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit78, Lit39, "Hint for TextBox1", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit78, Lit82, Boolean.TRUE, Lit6);
        return runtime.setAndCoerceProperty$Ex(Lit78, Lit15, "Es necesario que te dirijas fisicamente a la estación de SITP que deseas configurar como frecuente para el uso de tu apadrinado invidente.", Lit4);
    }

    static Object lambda30() {
        runtime.setAndCoerceProperty$Ex(Lit85, Lit46, Lit86, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit85, Lit87, "E1,E2,E3", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit85, Lit88, "E1,E2,E3", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit85, Lit48, Lit34, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit85, Lit15, "Seleccione Estación", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit85, Lit35, Lit89, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit85, Lit7, "Estaciones", Lit4);
    }

    static Object lambda31() {
        runtime.setAndCoerceProperty$Ex(Lit85, Lit46, Lit86, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit85, Lit87, "E1,E2,E3", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit85, Lit88, "E1,E2,E3", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit85, Lit48, Lit34, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit85, Lit15, "Seleccione Estación", Lit4);
        runtime.setAndCoerceProperty$Ex(Lit85, Lit35, Lit89, Lit28);
        return runtime.setAndCoerceProperty$Ex(Lit85, Lit7, "Estaciones", Lit4);
    }

    public Object lpEstaciones$AfterPicking() {
        runtime.setThisForm();
        return runtime.setAndCoerceProperty$Ex(Lit85, Lit15, runtime.getProperty$1(Lit85, Lit88), Lit4);
    }

    static Object lambda32() {
        return runtime.setAndCoerceProperty$Ex(Lit94, Lit39, "Alias Estación", Lit4);
    }

    static Object lambda33() {
        return runtime.setAndCoerceProperty$Ex(Lit94, Lit39, "Alias Estación", Lit4);
    }

    static Object lambda34() {
        return runtime.setAndCoerceProperty$Ex(Lit97, Lit39, "Nombre Estación", Lit4);
    }

    static Object lambda35() {
        return runtime.setAndCoerceProperty$Ex(Lit97, Lit39, "Nombre Estación", Lit4);
    }

    static Object lambda36() {
        return runtime.setAndCoerceProperty$Ex(Lit100, Lit15, "Espera un momento por favor...", Lit4);
    }

    static Object lambda37() {
        return runtime.setAndCoerceProperty$Ex(Lit100, Lit15, "Espera un momento por favor...", Lit4);
    }

    static Object lambda38() {
        runtime.setAndCoerceProperty$Ex(Lit103, Lit46, Lit104, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit103, Lit80, Boolean.FALSE, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit103, Lit32, Boolean.TRUE, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit103, Lit26, Lit27, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit103, Lit15, "!AQUÍ¡ es la estación", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit103, Lit49, Lit105, Lit28);
    }

    static Object lambda39() {
        runtime.setAndCoerceProperty$Ex(Lit103, Lit46, Lit104, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit103, Lit80, Boolean.FALSE, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit103, Lit32, Boolean.TRUE, Lit6);
        runtime.setAndCoerceProperty$Ex(Lit103, Lit26, Lit27, Lit28);
        runtime.setAndCoerceProperty$Ex(Lit103, Lit15, "!AQUÍ¡ es la estación", Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit103, Lit49, Lit105, Lit28);
    }

    public Object btnGuardarEst$Click() {
        runtime.setThisForm();
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.getProperty$1(Lit85, Lit15), "E1"), Lit107, "=") != Boolean.FALSE) {
            runtime.callComponentMethod(Lit8, Lit52, LList.list2("E1Alias", runtime.getProperty$1(Lit94, Lit15)), Lit108);
            runtime.callComponentMethod(Lit8, Lit52, LList.list2("E1Nombre", runtime.getProperty$1(Lit97, Lit15)), Lit109);
            runtime.callComponentMethod(Lit8, Lit52, LList.list2("E1Latitud", runtime.getProperty$1(Lit110, Lit111)), Lit112);
            runtime.callComponentMethod(Lit8, Lit52, LList.list2("E1Longitud", runtime.getProperty$1(Lit110, Lit113)), Lit114);
            runtime.callComponentMethod(Lit115, Lit116, LList.list1("Datos guardados para la estación 1"), Lit117);
            runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("misDestinos"), Lit118, "open another screen");
        } else if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.getProperty$1(Lit85, Lit15), "E2"), Lit119, "=") != Boolean.FALSE) {
            runtime.callComponentMethod(Lit8, Lit52, LList.list2("E2Alias", runtime.getProperty$1(Lit94, Lit15)), Lit120);
            runtime.callComponentMethod(Lit8, Lit52, LList.list2("E2Nombre", runtime.getProperty$1(Lit97, Lit15)), Lit121);
            runtime.callComponentMethod(Lit8, Lit52, LList.list2("E2Latitud", runtime.getProperty$1(Lit110, Lit111)), Lit122);
            runtime.callComponentMethod(Lit8, Lit52, LList.list2("E2Longitud", runtime.getProperty$1(Lit110, Lit113)), Lit123);
            runtime.callComponentMethod(Lit115, Lit116, LList.list1("Datos guardados para la estación 2"), Lit124);
            runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("misDestinos"), Lit125, "open another screen");
        } else if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.getProperty$1(Lit85, Lit15), "E3"), Lit126, "=") != Boolean.FALSE) {
            runtime.callComponentMethod(Lit8, Lit52, LList.list2("E3Alias", runtime.getProperty$1(Lit94, Lit15)), Lit127);
            runtime.callComponentMethod(Lit8, Lit52, LList.list2("E3Nombre", runtime.getProperty$1(Lit97, Lit15)), Lit128);
            runtime.callComponentMethod(Lit8, Lit52, LList.list2("E3Latitud", runtime.getProperty$1(Lit110, Lit111)), Lit129);
            runtime.callComponentMethod(Lit8, Lit52, LList.list2("E3Longitud", runtime.getProperty$1(Lit110, Lit113)), Lit130);
            runtime.callComponentMethod(Lit115, Lit116, LList.list1("Datos guardados para la estación 3"), Lit131);
        } else {
            runtime.callComponentMethod(Lit115, Lit116, LList.list1("Selecciona la estación"), Lit132);
            runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("misDestinos"), Lit133, "open another screen");
        }
        return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("misDestinos"), Lit134, "open another screen");
    }

    static Object lambda40() {
        return runtime.setAndCoerceProperty$Ex(Lit110, Lit139, Lit89, Lit28);
    }

    static Object lambda41() {
        return runtime.setAndCoerceProperty$Ex(Lit110, Lit139, Lit89, Lit28);
    }

    public Object lsCambioEst$LocationChanged(Object $latitude, Object $longitude, Object $altitude, Object $speed) {
        runtime.sanitizeComponentData($latitude);
        runtime.sanitizeComponentData($longitude);
        runtime.sanitizeComponentData($altitude);
        runtime.sanitizeComponentData($speed);
        runtime.setThisForm();
        runtime.setAndCoerceProperty$Ex(Lit100, Lit15, runtime.getProperty$1(Lit110, Lit141), Lit4);
        return runtime.setAndCoerceProperty$Ex(Lit103, Lit80, Boolean.TRUE, Lit6);
    }

    public void androidLogForm(Object message) {
    }

    public void addToFormEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.form$Mnenvironment, object));
        this.form$Mnenvironment.put(name, object);
    }

    public Object lookupInFormEnvironment(Symbol name, Object default$Mnvalue) {
        boolean x = ((this.form$Mnenvironment == null ? 1 : 0) + 1) & 1;
        if (x) {
            if (!this.form$Mnenvironment.isBound(name)) {
                return default$Mnvalue;
            }
        } else if (!x) {
            return default$Mnvalue;
        }
        return this.form$Mnenvironment.get(name);
    }

    public boolean isBoundInFormEnvironment(Symbol name) {
        return this.form$Mnenvironment.isBound(name);
    }

    public void addToGlobalVarEnvironment(Symbol name, Object object) {
        androidLogForm(Format.formatToString(0, "Adding ~A to env ~A with value ~A", name, this.global$Mnvar$Mnenvironment, object));
        this.global$Mnvar$Mnenvironment.put(name, object);
    }

    public void addToEvents(Object component$Mnname, Object event$Mnname) {
        this.events$Mnto$Mnregister = lists.cons(lists.cons(component$Mnname, event$Mnname), this.events$Mnto$Mnregister);
    }

    public void addToComponents(Object container$Mnname, Object component$Mntype, Object component$Mnname, Object init$Mnthunk) {
        this.components$Mnto$Mncreate = lists.cons(LList.list4(container$Mnname, component$Mntype, component$Mnname, init$Mnthunk), this.components$Mnto$Mncreate);
    }

    public void addToGlobalVars(Object var, Object val$Mnthunk) {
        this.global$Mnvars$Mnto$Mncreate = lists.cons(LList.list2(var, val$Mnthunk), this.global$Mnvars$Mnto$Mncreate);
    }

    public void addToFormDoAfterCreation(Object thunk) {
        this.form$Mndo$Mnafter$Mncreation = lists.cons(thunk, this.form$Mndo$Mnafter$Mncreation);
    }

    public void sendError(Object error) {
        RetValManager.sendError(error == null ? null : error.toString());
    }

    public void processException(Object ex) {
        Object apply1 = Scheme.applyToArgs.apply1(GetNamedPart.getNamedPart.apply2(ex, Lit1));
        RuntimeErrorAlert.alert(this, apply1 == null ? null : apply1.toString(), ex instanceof YailRuntimeError ? ((YailRuntimeError) ex).getErrorType() : "Runtime Error", "End Application");
    }

    public boolean dispatchEvent(Component componentObject, String registeredComponentName, String eventName, Object[] args) {
        SimpleSymbol registeredObject = misc.string$To$Symbol(registeredComponentName);
        if (!isBoundInFormEnvironment(registeredObject)) {
            EventDispatcher.unregisterEventForDelegation(this, registeredComponentName, eventName);
            return false;
        } else if (lookupInFormEnvironment(registeredObject) != componentObject) {
            return false;
        } else {
            try {
                Scheme.apply.apply2(lookupHandler(registeredComponentName, eventName), LList.makeList(args, 0));
                return true;
            } catch (Throwable exception) {
                androidLogForm(exception.getMessage());
                exception.printStackTrace();
                processException(exception);
                return false;
            }
        }
    }

    public Object lookupHandler(Object componentName, Object eventName) {
        String str = null;
        String obj = componentName == null ? null : componentName.toString();
        if (eventName != null) {
            str = eventName.toString();
        }
        return lookupInFormEnvironment(misc.string$To$Symbol(EventDispatcher.makeFullEventName(obj, str)));
    }

    public void $define() {
        Language.setDefaults(Scheme.getInstance());
        try {
            run();
        } catch (Exception exception) {
            androidLogForm(exception.getMessage());
            processException(exception);
        }
        AdminEst = this;
        addToFormEnvironment(Lit0, this);
        Object obj = this.events$Mnto$Mnregister;
        while (obj != LList.Empty) {
            try {
                Pair arg0 = (Pair) obj;
                Object event$Mninfo = arg0.getCar();
                Object apply1 = lists.car.apply1(event$Mninfo);
                String obj2 = apply1 == null ? null : apply1.toString();
                Object apply12 = lists.cdr.apply1(event$Mninfo);
                EventDispatcher.registerEventForDelegation(this, obj2, apply12 == null ? null : apply12.toString());
                obj = arg0.getCdr();
            } catch (ClassCastException e) {
                throw new WrongType(e, "arg0", -2, obj);
            }
        }
        addToGlobalVars(Lit2, lambda$Fn1);
        AdminEst closureEnv = this;
        obj = lists.reverse(this.global$Mnvars$Mnto$Mncreate);
        while (obj != LList.Empty) {
            try {
                arg0 = (Pair) obj;
                Object var$Mnval = arg0.getCar();
                Object var = lists.car.apply1(var$Mnval);
                addToGlobalVarEnvironment((Symbol) var, Scheme.applyToArgs.apply1(lists.cadr.apply1(var$Mnval)));
                obj = arg0.getCdr();
            } catch (ClassCastException e2) {
                throw new WrongType(e2, "arg0", -2, obj);
            } catch (ClassCastException e22) {
                throw new WrongType(e22, "arg0", -2, obj);
            } catch (ClassCastException e222) {
                throw new WrongType(e222, "add-to-form-environment", 0, component$Mnname);
            } catch (ClassCastException e3) {
                throw new WrongType(e3, "lookup-in-form-environment", 0, apply1);
            } catch (ClassCastException e2222) {
                throw new WrongType(e2222, "arg0", -2, obj);
            } catch (ClassCastException e22222) {
                throw new WrongType(e22222, "arg0", -2, obj);
            } catch (ClassCastException e222222) {
                throw new WrongType(e222222, "add-to-global-var-environment", 0, var);
            } catch (ClassCastException e2222222) {
                throw new WrongType(e2222222, "arg0", -2, obj);
            } catch (YailRuntimeError exception2) {
                processException(exception2);
                return;
            }
        }
        obj = lists.reverse(this.form$Mndo$Mnafter$Mncreation);
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            misc.force(arg0.getCar());
            obj = arg0.getCdr();
        }
        LList component$Mndescriptors = lists.reverse(this.components$Mnto$Mncreate);
        closureEnv = this;
        obj = component$Mndescriptors;
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            Object component$Mninfo = arg0.getCar();
            Object component$Mnname = lists.caddr.apply1(component$Mninfo);
            lists.cadddr.apply1(component$Mninfo);
            Object component$Mnobject = Invoke.make.apply2(lists.cadr.apply1(component$Mninfo), lookupInFormEnvironment((Symbol) lists.car.apply1(component$Mninfo)));
            SlotSet.set$Mnfield$Ex.apply3(this, component$Mnname, component$Mnobject);
            addToFormEnvironment((Symbol) component$Mnname, component$Mnobject);
            obj = arg0.getCdr();
        }
        obj = component$Mndescriptors;
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            component$Mninfo = arg0.getCar();
            lists.caddr.apply1(component$Mninfo);
            Boolean init$Mnthunk = lists.cadddr.apply1(component$Mninfo);
            if (init$Mnthunk != Boolean.FALSE) {
                Scheme.applyToArgs.apply1(init$Mnthunk);
            }
            obj = arg0.getCdr();
        }
        obj = component$Mndescriptors;
        while (obj != LList.Empty) {
            arg0 = (Pair) obj;
            component$Mninfo = arg0.getCar();
            component$Mnname = lists.caddr.apply1(component$Mninfo);
            lists.cadddr.apply1(component$Mninfo);
            callInitialize(SlotGet.field.apply2(this, component$Mnname));
            obj = arg0.getCdr();
        }
    }

    public static SimpleSymbol lambda1symbolAppend$V(Object[] argsArray) {
        Object car;
        LList symbols = LList.makeList(argsArray, 0);
        Procedure procedure = Scheme.apply;
        ModuleMethod moduleMethod = strings.string$Mnappend;
        Pair result = LList.Empty;
        Object arg0 = symbols;
        while (arg0 != LList.Empty) {
            try {
                Pair arg02 = (Pair) arg0;
                Object arg03 = arg02.getCdr();
                car = arg02.getCar();
                try {
                    result = Pair.make(misc.symbol$To$String((Symbol) car), result);
                    arg0 = arg03;
                } catch (ClassCastException e) {
                    throw new WrongType(e, "symbol->string", 1, car);
                }
            } catch (ClassCastException e2) {
                throw new WrongType(e2, "arg0", -2, arg0);
            }
        }
        car = procedure.apply2(moduleMethod, LList.reverseInPlace(result));
        try {
            return misc.string$To$Symbol((CharSequence) car);
        } catch (ClassCastException e3) {
            throw new WrongType(e3, "string->symbol", 1, car);
        }
    }

    static Object lambda2() {
        return null;
    }
}
