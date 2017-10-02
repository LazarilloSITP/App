package appinventor.ai_andres_murciat.Lazarillo;

import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.ActivityStarter;
import com.google.appinventor.components.runtime.Canvas;
import com.google.appinventor.components.runtime.Clock;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.Player;
import com.google.appinventor.components.runtime.TextToSpeech;
import com.google.appinventor.components.runtime.TinyDB;
import com.google.appinventor.components.runtime.Web;
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
import gnu.kawa.functions.NumberCompare;
import gnu.kawa.reflect.Invoke;
import gnu.kawa.reflect.SlotGet;
import gnu.kawa.reflect.SlotSet;
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
import gnu.math.DFloNum;
import gnu.math.IntNum;
import kawa.lang.Promise;
import kawa.lib.lists;
import kawa.lib.misc;
import kawa.lib.numbers;
import kawa.lib.strings;
import kawa.standard.Scheme;
import kawa.standard.require;

/* compiled from: misDestinos.yail */
public class misDestinos extends Form implements Runnable {
    static final SimpleSymbol Lit0 = ((SimpleSymbol) new SimpleSymbol("misDestinos").readResolve());
    static final SimpleSymbol Lit1 = ((SimpleSymbol) new SimpleSymbol("getMessage").readResolve());
    static final SimpleSymbol Lit10 = ((SimpleSymbol) new SimpleSymbol("AppName").readResolve());
    static final PairWithPosition Lit100 = PairWithPosition.make(Lit53, PairWithPosition.make(Lit53, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 147643), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 147635);
    static final PairWithPosition Lit101 = PairWithPosition.make(Lit53, PairWithPosition.make(Lit53, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 147740), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 147732);
    static final PairWithPosition Lit102 = PairWithPosition.make(Lit11, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 147869);
    static final IntNum Lit103 = IntNum.make(-45);
    static final PairWithPosition Lit104 = PairWithPosition.make(Lit53, PairWithPosition.make(Lit53, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 148000), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 147992);
    static final IntNum Lit105 = IntNum.make(-135);
    static final PairWithPosition Lit106;
    static final PairWithPosition Lit107 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 148301), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 148295);
    static final PairWithPosition Lit108 = PairWithPosition.make(Lit11, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 148309);
    static final PairWithPosition Lit109 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 148587), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 148581);
    static final SimpleSymbol Lit11;
    static final PairWithPosition Lit110 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 148684), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 148678);
    static final PairWithPosition Lit111 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit11, PairWithPosition.make(Lit11, PairWithPosition.make(Lit11, PairWithPosition.make(Lit11, PairWithPosition.make(Lit11, PairWithPosition.make(Lit11, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 148797), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 148792), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 148787), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 148782), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 148777), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 148772), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 148766);
    static final PairWithPosition Lit112 = PairWithPosition.make(Lit168, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 149159), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 149154);
    static final PairWithPosition Lit113 = PairWithPosition.make(Lit168, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 149183);
    static final PairWithPosition Lit114 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 149432), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 149426);
    static final PairWithPosition Lit115 = PairWithPosition.make(Lit169, PairWithPosition.make(Lit11, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 149631), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 149616);
    static final PairWithPosition Lit116 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit11, PairWithPosition.make(Lit11, PairWithPosition.make(Lit11, PairWithPosition.make(Lit11, PairWithPosition.make(Lit11, PairWithPosition.make(Lit11, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 149742), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 149737), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 149732), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 149727), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 149722), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 149717), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 149711);
    static final PairWithPosition Lit117 = PairWithPosition.make(Lit11, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 149759);
    static final SimpleSymbol Lit118 = ((SimpleSymbol) new SimpleSymbol("Canvas1$Flung").readResolve());
    static final SimpleSymbol Lit119 = ((SimpleSymbol) new SimpleSymbol("Flung").readResolve());
    static final SimpleSymbol Lit12 = ((SimpleSymbol) new SimpleSymbol("ShowStatusBar").readResolve());
    static final FString Lit120 = new FString("com.google.appinventor.components.runtime.TinyDB");
    static final FString Lit121 = new FString("com.google.appinventor.components.runtime.TinyDB");
    static final FString Lit122 = new FString("com.google.appinventor.components.runtime.Player");
    static final SimpleSymbol Lit123 = ((SimpleSymbol) new SimpleSymbol("Source").readResolve());
    static final FString Lit124 = new FString("com.google.appinventor.components.runtime.Player");
    static final FString Lit125 = new FString("com.google.appinventor.components.runtime.Clock");
    static final SimpleSymbol Lit126 = ((SimpleSymbol) new SimpleSymbol("TimerInterval").readResolve());
    static final IntNum Lit127 = IntNum.make(9000);
    static final FString Lit128 = new FString("com.google.appinventor.components.runtime.Clock");
    static final PairWithPosition Lit129 = PairWithPosition.make(Lit168, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 237664), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 237659);
    static final SimpleSymbol Lit13 = ((SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve());
    static final IntNum Lit130 = IntNum.make(1);
    static final PairWithPosition Lit131 = PairWithPosition.make(Lit168, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 238035), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 238030);
    static final PairWithPosition Lit132 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 238287), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 238281);
    static final PairWithPosition Lit133 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit11, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 238302), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 238296);
    static final PairWithPosition Lit134 = PairWithPosition.make(Lit11, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 238319);
    static final SimpleSymbol Lit135 = ((SimpleSymbol) new SimpleSymbol("Clock1$Timer").readResolve());
    static final SimpleSymbol Lit136 = ((SimpleSymbol) new SimpleSymbol("Timer").readResolve());
    static final FString Lit137 = new FString("com.google.appinventor.components.runtime.Clock");
    static final IntNum Lit138 = IntNum.make(6000);
    static final FString Lit139 = new FString("com.google.appinventor.components.runtime.Clock");
    static final SimpleSymbol Lit14 = ((SimpleSymbol) new SimpleSymbol("Title").readResolve());
    static final PairWithPosition Lit140 = PairWithPosition.make(Lit168, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 282720), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 282715);
    static final PairWithPosition Lit141 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 282970), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 282964);
    static final PairWithPosition Lit142 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit11, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 282985), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 282979);
    static final PairWithPosition Lit143 = PairWithPosition.make(Lit11, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 283002);
    static final PairWithPosition Lit144 = PairWithPosition.make(Lit168, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 283256), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 283251);
    static final PairWithPosition Lit145 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 283505), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 283499);
    static final PairWithPosition Lit146 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit11, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 283520), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 283514);
    static final PairWithPosition Lit147;
    static final SimpleSymbol Lit148 = ((SimpleSymbol) new SimpleSymbol("Clock2$Timer").readResolve());
    static final FString Lit149 = new FString("com.google.appinventor.components.runtime.TextToSpeech");
    static final SimpleSymbol Lit15 = ((SimpleSymbol) new SimpleSymbol("TitleVisible").readResolve());
    static final FString Lit150 = new FString("com.google.appinventor.components.runtime.TextToSpeech");
    static final FString Lit151 = new FString("com.google.appinventor.components.runtime.ActivityStarter");
    static final SimpleSymbol Lit152 = ((SimpleSymbol) new SimpleSymbol("Action").readResolve());
    static final FString Lit153 = new FString("com.google.appinventor.components.runtime.ActivityStarter");
    static final FString Lit154 = new FString("com.google.appinventor.components.runtime.Web");
    static final FString Lit155 = new FString("com.google.appinventor.components.runtime.Web");
    static final SimpleSymbol Lit156 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final SimpleSymbol Lit157 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    static final SimpleSymbol Lit158 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final SimpleSymbol Lit159 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final SimpleSymbol Lit16 = ((SimpleSymbol) new SimpleSymbol("Player1").readResolve());
    static final SimpleSymbol Lit160 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit161 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final SimpleSymbol Lit162 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final SimpleSymbol Lit163 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    static final SimpleSymbol Lit164 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit165 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final SimpleSymbol Lit166 = ((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve());
    static final SimpleSymbol Lit167 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final SimpleSymbol Lit168 = ((SimpleSymbol) new SimpleSymbol("any").readResolve());
    static final SimpleSymbol Lit169 = ((SimpleSymbol) new SimpleSymbol("InstantInTime").readResolve());
    static final SimpleSymbol Lit17 = ((SimpleSymbol) new SimpleSymbol("Start").readResolve());
    static final SimpleSymbol Lit18 = ((SimpleSymbol) new SimpleSymbol("Clock1").readResolve());
    static final SimpleSymbol Lit19 = ((SimpleSymbol) new SimpleSymbol("TimerEnabled").readResolve());
    static final SimpleSymbol Lit2 = ((SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve());
    static final SimpleSymbol Lit20 = ((SimpleSymbol) new SimpleSymbol("TinyDB1").readResolve());
    static final SimpleSymbol Lit21 = ((SimpleSymbol) new SimpleSymbol("GetValue").readResolve());
    static final PairWithPosition Lit22 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 90357), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 90351);
    static final PairWithPosition Lit23 = PairWithPosition.make(Lit168, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 90455), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 90450);
    static final SimpleSymbol Lit24 = ((SimpleSymbol) new SimpleSymbol("StoreValue").readResolve());
    static final PairWithPosition Lit25 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 90588), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 90582);
    static final PairWithPosition Lit26 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 90709), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 90703);
    static final PairWithPosition Lit27 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 90829), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 90823);
    static final PairWithPosition Lit28 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 90934), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 90928);
    static final DFloNum Lit29 = DFloNum.make(4.699393d);
    static final SimpleSymbol Lit3 = ((SimpleSymbol) new SimpleSymbol("g$sn_listoSel").readResolve());
    static final PairWithPosition Lit30 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 91033), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 91027);
    static final DFloNum Lit31 = DFloNum.make(-74.0776153d);
    static final PairWithPosition Lit32 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 91136), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 91130);
    static final PairWithPosition Lit33 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 91251), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 91245);
    static final PairWithPosition Lit34 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 91356), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 91350);
    static final DFloNum Lit35 = DFloNum.make(4.669166731392568d);
    static final PairWithPosition Lit36 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 91464), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 91458);
    static final DFloNum Lit37 = DFloNum.make(-74.10320430994034d);
    static final PairWithPosition Lit38 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 91574), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 91568);
    static final PairWithPosition Lit39 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 91673), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 91667);
    static final IntNum Lit4 = IntNum.make(0);
    static final PairWithPosition Lit40 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 91778), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 91772);
    static final DFloNum Lit41 = DFloNum.make(4.669098562043755d);
    static final PairWithPosition Lit42 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 91886), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 91880);
    static final DFloNum Lit43 = DFloNum.make(-74.10448908805847d);
    static final PairWithPosition Lit44 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 91996), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 91990);
    static final PairWithPosition Lit45 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 92091), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 92085);
    static final SimpleSymbol Lit46 = ((SimpleSymbol) new SimpleSymbol("misDestinos$Initialize").readResolve());
    static final SimpleSymbol Lit47 = ((SimpleSymbol) new SimpleSymbol("Initialize").readResolve());
    static final FString Lit48 = new FString("com.google.appinventor.components.runtime.Canvas");
    static final SimpleSymbol Lit49 = ((SimpleSymbol) new SimpleSymbol("Canvas1").readResolve());
    static final SimpleSymbol Lit5 = ((SimpleSymbol) new SimpleSymbol("g$NumGrabacion").readResolve());
    static final SimpleSymbol Lit50 = ((SimpleSymbol) new SimpleSymbol("BackgroundImage").readResolve());
    static final SimpleSymbol Lit51 = ((SimpleSymbol) new SimpleSymbol("Height").readResolve());
    static final IntNum Lit52 = IntNum.make(-2);
    static final SimpleSymbol Lit53;
    static final SimpleSymbol Lit54 = ((SimpleSymbol) new SimpleSymbol("Width").readResolve());
    static final FString Lit55 = new FString("com.google.appinventor.components.runtime.Canvas");
    static final SimpleSymbol Lit56 = ((SimpleSymbol) new SimpleSymbol("$heading").readResolve());
    static final PairWithPosition Lit57 = PairWithPosition.make(Lit53, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 143484);
    static final IntNum Lit58 = IntNum.make(45);
    static final PairWithPosition Lit59 = PairWithPosition.make(Lit53, PairWithPosition.make(Lit53, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 143513), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 143505);
    static final SimpleSymbol Lit6 = ((SimpleSymbol) new SimpleSymbol("g$Origen").readResolve());
    static final SimpleSymbol Lit60 = ((SimpleSymbol) new SimpleSymbol("Stop").readResolve());
    static final SimpleSymbol Lit61 = ((SimpleSymbol) new SimpleSymbol("TextToSpeech1").readResolve());
    static final SimpleSymbol Lit62 = ((SimpleSymbol) new SimpleSymbol("Speak").readResolve());
    static final PairWithPosition Lit63 = PairWithPosition.make(Lit11, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 143666);
    static final PairWithPosition Lit64 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 143854), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 143848);
    static final PairWithPosition Lit65 = PairWithPosition.make(Lit11, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 143862);
    static final SimpleSymbol Lit66 = ((SimpleSymbol) new SimpleSymbol("ActivityStarter1").readResolve());
    static final SimpleSymbol Lit67 = ((SimpleSymbol) new SimpleSymbol("DataUri").readResolve());
    static final PairWithPosition Lit68 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 144140), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 144134);
    static final PairWithPosition Lit69 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 144237), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 144231);
    static final SimpleSymbol Lit7 = ((SimpleSymbol) new SimpleSymbol("g$Seleccion").readResolve());
    static final PairWithPosition Lit70 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit11, PairWithPosition.make(Lit11, PairWithPosition.make(Lit11, PairWithPosition.make(Lit11, PairWithPosition.make(Lit11, PairWithPosition.make(Lit11, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 144350), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 144345), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 144340), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 144335), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 144330), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 144325), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 144319);
    static final SimpleSymbol Lit71 = ((SimpleSymbol) new SimpleSymbol("Web1").readResolve());
    static final SimpleSymbol Lit72 = ((SimpleSymbol) new SimpleSymbol("Url").readResolve());
    static final SimpleSymbol Lit73 = ((SimpleSymbol) new SimpleSymbol("RequestHeaders").readResolve());
    static final PairWithPosition Lit74 = PairWithPosition.make(Lit168, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 144712), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 144707);
    static final PairWithPosition Lit75 = PairWithPosition.make(Lit168, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 144736);
    static final SimpleSymbol Lit76 = ((SimpleSymbol) new SimpleSymbol("list").readResolve());
    static final SimpleSymbol Lit77 = ((SimpleSymbol) new SimpleSymbol("PostText").readResolve());
    static final PairWithPosition Lit78 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 144985), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 144979);
    static final SimpleSymbol Lit79 = ((SimpleSymbol) new SimpleSymbol("FormatDateTime").readResolve());
    static final SimpleSymbol Lit8 = ((SimpleSymbol) new SimpleSymbol("g$InicializarE").readResolve());
    static final SimpleSymbol Lit80 = ((SimpleSymbol) new SimpleSymbol("Now").readResolve());
    static final PairWithPosition Lit81 = PairWithPosition.make(Lit169, PairWithPosition.make(Lit11, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 145184), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 145169);
    static final PairWithPosition Lit82 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit11, PairWithPosition.make(Lit11, PairWithPosition.make(Lit11, PairWithPosition.make(Lit11, PairWithPosition.make(Lit11, PairWithPosition.make(Lit11, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 145295), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 145290), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 145285), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 145280), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 145275), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 145270), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 145264);
    static final PairWithPosition Lit83 = PairWithPosition.make(Lit11, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 145312);
    static final SimpleSymbol Lit84 = ((SimpleSymbol) new SimpleSymbol("StartActivity").readResolve());
    static final SimpleSymbol Lit85 = ((SimpleSymbol) new SimpleSymbol("Clock2").readResolve());
    static final PairWithPosition Lit86 = PairWithPosition.make(Lit53, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 145641);
    static final IntNum Lit87 = IntNum.make(135);
    static final PairWithPosition Lit88 = PairWithPosition.make(Lit53, PairWithPosition.make(Lit53, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 145671), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 145663);
    static final PairWithPosition Lit89 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 145876), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 145870);
    static final IntNum Lit9 = IntNum.make(-1);
    static final PairWithPosition Lit90 = PairWithPosition.make(Lit11, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 145884);
    static final PairWithPosition Lit91 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 146162), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 146156);
    static final PairWithPosition Lit92 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 146259), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 146253);
    static final PairWithPosition Lit93 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit11, PairWithPosition.make(Lit11, PairWithPosition.make(Lit11, PairWithPosition.make(Lit11, PairWithPosition.make(Lit11, PairWithPosition.make(Lit11, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 146372), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 146367), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 146362), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 146357), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 146352), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 146347), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 146341);
    static final PairWithPosition Lit94 = PairWithPosition.make(Lit168, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 146734), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 146729);
    static final PairWithPosition Lit95 = PairWithPosition.make(Lit168, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 146758);
    static final PairWithPosition Lit96 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit168, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 147007), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 147001);
    static final PairWithPosition Lit97 = PairWithPosition.make(Lit169, PairWithPosition.make(Lit11, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 147206), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 147191);
    static final PairWithPosition Lit98 = PairWithPosition.make(Lit11, PairWithPosition.make(Lit11, PairWithPosition.make(Lit11, PairWithPosition.make(Lit11, PairWithPosition.make(Lit11, PairWithPosition.make(Lit11, PairWithPosition.make(Lit11, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 147317), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 147312), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 147307), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 147302), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 147297), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 147292), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 147286);
    static final PairWithPosition Lit99 = PairWithPosition.make(Lit11, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 147334);
    static final ModuleMethod lambda$Fn1 = null;
    static final ModuleMethod lambda$Fn14 = null;
    static final ModuleMethod lambda$Fn15 = null;
    static final ModuleMethod lambda$Fn16 = null;
    static final ModuleMethod lambda$Fn17 = null;
    static final ModuleMethod lambda$Fn18 = null;
    static final ModuleMethod lambda$Fn19 = null;
    static final ModuleMethod lambda$Fn2 = null;
    static final ModuleMethod lambda$Fn20 = null;
    static final ModuleMethod lambda$Fn21 = null;
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    static final ModuleMethod lambda$Fn7 = null;
    static final ModuleMethod lambda$Fn8 = null;
    static final ModuleMethod lambda$Fn9 = null;
    public static misDestinos misDestinos;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public ActivityStarter ActivityStarter1;
    public Canvas Canvas1;
    public final ModuleMethod Canvas1$Flung;
    public Clock Clock1;
    public final ModuleMethod Clock1$Timer;
    public Clock Clock2;
    public final ModuleMethod Clock2$Timer;
    public Player Player1;
    public TextToSpeech TextToSpeech1;
    public TinyDB TinyDB1;
    public Web Web1;
    public final ModuleMethod add$Mnto$Mncomponents;
    public final ModuleMethod add$Mnto$Mnevents;
    public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
    public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
    public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
    public final ModuleMethod android$Mnlog$Mnform;
    public LList components$Mnto$Mncreate;
    public final ModuleMethod dispatchEvent;
    public LList events$Mnto$Mnregister;
    public LList form$Mndo$Mnafter$Mncreation;
    public Environment form$Mnenvironment;
    public Symbol form$Mnname$Mnsymbol;
    public Environment global$Mnvar$Mnenvironment;
    public LList global$Mnvars$Mnto$Mncreate;
    public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod misDestinos$Initialize;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;

    /* compiled from: misDestinos.yail */
    public class frame0 extends ModuleBody {
        Object $heading;
        final ModuleMethod lambda$Fn10 = new ModuleMethod(this, 1, null, 0);
        final ModuleMethod lambda$Fn11 = new ModuleMethod(this, 2, null, 0);
        final ModuleMethod lambda$Fn12 = new ModuleMethod(this, 3, null, 0);
        final ModuleMethod lambda$Fn13 = new ModuleMethod(this, 4, null, 0);

        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case 1:
                    return lambda11();
                case 2:
                    return lambda12();
                case 3:
                    return lambda13();
                case 4:
                    return lambda14();
                default:
                    return super.apply0(moduleMethod);
            }
        }

        public int match0(ModuleMethod moduleMethod, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 1:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 2:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 3:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                case 4:
                    callContext.proc = moduleMethod;
                    callContext.pc = 0;
                    return 0;
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }

        Object lambda11() {
            Object signalRuntimeError;
            NumberCompare numberCompare = Scheme.numGEq;
            if (this.$heading instanceof Package) {
                signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(misDestinos.Lit56), " is not bound in the current context"), "Unbound Variable");
            } else {
                signalRuntimeError = this.$heading;
            }
            return runtime.callYailPrimitive(numberCompare, LList.list2(signalRuntimeError, misDestinos.Lit58), misDestinos.Lit100, ">=");
        }

        Object lambda12() {
            Object signalRuntimeError;
            NumberCompare numberCompare = Scheme.numLEq;
            if (this.$heading instanceof Package) {
                signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(misDestinos.Lit56), " is not bound in the current context"), "Unbound Variable");
            } else {
                signalRuntimeError = this.$heading;
            }
            return runtime.callYailPrimitive(numberCompare, LList.list2(signalRuntimeError, misDestinos.Lit87), misDestinos.Lit101, "<=");
        }

        Object lambda13() {
            Object signalRuntimeError;
            NumberCompare numberCompare = Scheme.numLEq;
            if (this.$heading instanceof Package) {
                signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(misDestinos.Lit56), " is not bound in the current context"), "Unbound Variable");
            } else {
                signalRuntimeError = this.$heading;
            }
            return runtime.callYailPrimitive(numberCompare, LList.list2(signalRuntimeError, misDestinos.Lit103), misDestinos.Lit104, "<=");
        }

        Object lambda14() {
            Object signalRuntimeError;
            NumberCompare numberCompare = Scheme.numGEq;
            if (this.$heading instanceof Package) {
                signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(misDestinos.Lit56), " is not bound in the current context"), "Unbound Variable");
            } else {
                signalRuntimeError = this.$heading;
            }
            return runtime.callYailPrimitive(numberCompare, LList.list2(signalRuntimeError, misDestinos.Lit105), misDestinos.Lit106, ">=");
        }
    }

    /* compiled from: misDestinos.yail */
    public class frame extends ModuleBody {
        misDestinos $main = this;

        public Object applyN(ModuleMethod moduleMethod, Object[] objArr) {
            return moduleMethod.selector == 30 ? this.$main.Canvas1$Flung(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6]) : super.applyN(moduleMethod, objArr);
        }

        public int matchN(ModuleMethod moduleMethod, Object[] objArr, CallContext callContext) {
            if (moduleMethod.selector != 30) {
                return super.matchN(moduleMethod, objArr, callContext);
            }
            callContext.values = objArr;
            callContext.proc = moduleMethod;
            callContext.pc = 5;
            return 0;
        }

        public int match1(ModuleMethod moduleMethod, Object obj, CallContext callContext) {
            switch (moduleMethod.selector) {
                case 5:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 7:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 9:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 14:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 15:
                    callContext.value1 = obj;
                    callContext.proc = moduleMethod;
                    callContext.pc = 1;
                    return 0;
                case 16:
                    if (!(obj instanceof misDestinos)) {
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
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 10:
                    if (!(obj instanceof Symbol)) {
                        return -786431;
                    }
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 11:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 13:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.proc = moduleMethod;
                    callContext.pc = 2;
                    return 0;
                case 18:
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
                case 12:
                    callContext.value1 = obj;
                    callContext.value2 = obj2;
                    callContext.value3 = obj3;
                    callContext.value4 = obj4;
                    callContext.proc = moduleMethod;
                    callContext.pc = 4;
                    return 0;
                case 17:
                    if (!(obj instanceof misDestinos)) {
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
                default:
                    return super.match4(moduleMethod, obj, obj2, obj3, obj4, callContext);
            }
        }

        public Object apply1(ModuleMethod moduleMethod, Object obj) {
            switch (moduleMethod.selector) {
                case 5:
                    this.$main.androidLogForm(obj);
                    return Values.empty;
                case 7:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj);
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "lookup-in-form-environment", 1, obj);
                    }
                case 9:
                    try {
                        return this.$main.isBoundInFormEnvironment((Symbol) obj) ? Boolean.TRUE : Boolean.FALSE;
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "is-bound-in-form-environment", 1, obj);
                    }
                case 14:
                    this.$main.addToFormDoAfterCreation(obj);
                    return Values.empty;
                case 15:
                    this.$main.sendError(obj);
                    return Values.empty;
                case 16:
                    this.$main.processException(obj);
                    return Values.empty;
                default:
                    return super.apply1(moduleMethod, obj);
            }
        }

        public Object apply4(ModuleMethod moduleMethod, Object obj, Object obj2, Object obj3, Object obj4) {
            switch (moduleMethod.selector) {
                case 12:
                    this.$main.addToComponents(obj, obj2, obj3, obj4);
                    return Values.empty;
                case 17:
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
                default:
                    return super.apply4(moduleMethod, obj, obj2, obj3, obj4);
            }
        }

        public Object apply2(ModuleMethod moduleMethod, Object obj, Object obj2) {
            switch (moduleMethod.selector) {
                case 6:
                    try {
                        this.$main.addToFormEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e) {
                        throw new WrongType(e, "add-to-form-environment", 1, obj);
                    }
                case 7:
                    try {
                        return this.$main.lookupInFormEnvironment((Symbol) obj, obj2);
                    } catch (ClassCastException e2) {
                        throw new WrongType(e2, "lookup-in-form-environment", 1, obj);
                    }
                case 10:
                    try {
                        this.$main.addToGlobalVarEnvironment((Symbol) obj, obj2);
                        return Values.empty;
                    } catch (ClassCastException e22) {
                        throw new WrongType(e22, "add-to-global-var-environment", 1, obj);
                    }
                case 11:
                    this.$main.addToEvents(obj, obj2);
                    return Values.empty;
                case 13:
                    this.$main.addToGlobalVars(obj, obj2);
                    return Values.empty;
                case 18:
                    return this.$main.lookupHandler(obj, obj2);
                default:
                    return super.apply2(moduleMethod, obj, obj2);
            }
        }

        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case 19:
                    return misDestinos.lambda2();
                case 20:
                    this.$main.$define();
                    return Values.empty;
                case 21:
                    return misDestinos.lambda3();
                case 22:
                    return misDestinos.lambda4();
                case 23:
                    return misDestinos.lambda5();
                case 24:
                    return misDestinos.lambda6();
                case 25:
                    return misDestinos.lambda7();
                case 26:
                    return misDestinos.lambda8();
                case 27:
                    return this.$main.misDestinos$Initialize();
                case 28:
                    return misDestinos.lambda9();
                case 29:
                    return misDestinos.lambda10();
                case 31:
                    return misDestinos.lambda15();
                case 32:
                    return misDestinos.lambda16();
                case 33:
                    return misDestinos.lambda17();
                case 34:
                    return misDestinos.lambda18();
                case 35:
                    return this.$main.Clock1$Timer();
                case 36:
                    return misDestinos.lambda19();
                case 37:
                    return misDestinos.lambda20();
                case 38:
                    return this.$main.Clock2$Timer();
                case 39:
                    return misDestinos.lambda21();
                case 40:
                    return misDestinos.lambda22();
                default:
                    return super.apply0(moduleMethod);
            }
        }

        public int match0(ModuleMethod moduleMethod, CallContext callContext) {
            switch (moduleMethod.selector) {
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
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }
    }

    static {
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit11 = simpleSymbol;
        Lit147 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 283537);
        simpleSymbol = (SimpleSymbol) new SimpleSymbol("number").readResolve();
        Lit53 = simpleSymbol;
        Lit106 = PairWithPosition.make(simpleSymbol, PairWithPosition.make(Lit53, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 148098), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/misDestinos.yail", 148090);
    }

    public misDestinos() {
        ModuleInfo.register(this);
        ModuleBody appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame = new frame();
        this.android$Mnlog$Mnform = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame, 5, Lit156, 4097);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame, 6, Lit157, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame, 7, Lit158, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame, 9, Lit159, 4097);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame, 10, Lit160, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame, 11, Lit161, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame, 12, Lit162, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame, 13, Lit163, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame, 14, Lit164, 4097);
        this.send$Mnerror = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame, 15, Lit165, 4097);
        this.process$Mnexception = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame, 16, "process-exception", 4097);
        this.dispatchEvent = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame, 17, Lit166, 16388);
        this.lookup$Mnhandler = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame, 18, Lit167, 8194);
        PropertySet moduleMethod = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame, 19, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime4225462389548583421.scm:552");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame, 20, "$define", 0);
        lambda$Fn2 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame, 21, null, 0);
        lambda$Fn3 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame, 22, null, 0);
        lambda$Fn4 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame, 23, null, 0);
        lambda$Fn5 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame, 24, null, 0);
        lambda$Fn6 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame, 25, null, 0);
        lambda$Fn7 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame, 26, null, 0);
        this.misDestinos$Initialize = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame, 27, Lit46, 0);
        lambda$Fn8 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame, 28, null, 0);
        lambda$Fn9 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame, 29, null, 0);
        this.Canvas1$Flung = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame, 30, Lit118, 28679);
        lambda$Fn14 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame, 31, null, 0);
        lambda$Fn15 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame, 32, null, 0);
        lambda$Fn16 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame, 33, null, 0);
        lambda$Fn17 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame, 34, null, 0);
        this.Clock1$Timer = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame, 35, Lit135, 0);
        lambda$Fn18 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame, 36, null, 0);
        lambda$Fn19 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame, 37, null, 0);
        this.Clock2$Timer = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame, 38, Lit148, 0);
        lambda$Fn20 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame, 39, null, 0);
        lambda$Fn21 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame, 40, null, 0);
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
            misDestinos = null;
            this.form$Mnname$Mnsymbol = Lit0;
            this.events$Mnto$Mnregister = LList.Empty;
            this.components$Mnto$Mncreate = LList.Empty;
            this.global$Mnvars$Mnto$Mncreate = LList.Empty;
            this.form$Mndo$Mnafter$Mncreation = LList.Empty;
            find = require.find("com.google.youngandroid.runtime");
            try {
                ((Runnable) find).run();
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit3, Lit4), $result);
                } else {
                    addToGlobalVars(Lit3, lambda$Fn2);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit5, Lit4), $result);
                } else {
                    addToGlobalVars(Lit5, lambda$Fn3);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit6, runtime.callYailPrimitive(runtime.get$Mnstart$Mnvalue, LList.Empty, LList.Empty, "get start value")), $result);
                } else {
                    addToGlobalVars(Lit6, lambda$Fn4);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit7, "Nothing"), $result);
                } else {
                    addToGlobalVars(Lit7, lambda$Fn5);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit8, Lit9), $result);
                } else {
                    addToGlobalVars(Lit8, lambda$Fn6);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit10, "LazarilloSITPV1", Lit11);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit12, Boolean.FALSE, Lit13);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit14, "misDestinos", Lit11);
                    Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit15, Boolean.FALSE, Lit13), $result);
                } else {
                    addToFormDoAfterCreation(new Promise(lambda$Fn7));
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit46, this.misDestinos$Initialize);
                } else {
                    addToFormEnvironment(Lit46, this.misDestinos$Initialize);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "misDestinos", "Initialize");
                } else {
                    addToEvents(Lit0, Lit47);
                }
                this.Canvas1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit48, Lit49, lambda$Fn8), $result);
                } else {
                    addToComponents(Lit0, Lit55, Lit49, lambda$Fn9);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit118, this.Canvas1$Flung);
                } else {
                    addToFormEnvironment(Lit118, this.Canvas1$Flung);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Canvas1", "Flung");
                } else {
                    addToEvents(Lit49, Lit119);
                }
                this.TinyDB1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit120, Lit20, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit121, Lit20, Boolean.FALSE);
                }
                this.Player1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit122, Lit16, lambda$Fn14), $result);
                } else {
                    addToComponents(Lit0, Lit124, Lit16, lambda$Fn15);
                }
                this.Clock1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit125, Lit18, lambda$Fn16), $result);
                } else {
                    addToComponents(Lit0, Lit128, Lit18, lambda$Fn17);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit135, this.Clock1$Timer);
                } else {
                    addToFormEnvironment(Lit135, this.Clock1$Timer);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Clock1", "Timer");
                } else {
                    addToEvents(Lit18, Lit136);
                }
                this.Clock2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit137, Lit85, lambda$Fn18), $result);
                } else {
                    addToComponents(Lit0, Lit139, Lit85, lambda$Fn19);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit148, this.Clock2$Timer);
                } else {
                    addToFormEnvironment(Lit148, this.Clock2$Timer);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Clock2", "Timer");
                } else {
                    addToEvents(Lit85, Lit136);
                }
                this.TextToSpeech1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit149, Lit61, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit150, Lit61, Boolean.FALSE);
                }
                this.ActivityStarter1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit151, Lit66, lambda$Fn20), $result);
                } else {
                    addToComponents(Lit0, Lit153, Lit66, lambda$Fn21);
                }
                this.Web1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit154, Lit71, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit155, Lit71, Boolean.FALSE);
                }
                runtime.initRuntime();
            } catch (ClassCastException e) {
                throw new WrongType(e, "java.lang.Runnable.run()", 1, find);
            }
        } catch (ClassCastException e2) {
            throw new WrongType(e2, "java.lang.Runnable.run()", 1, find);
        }
    }

    static IntNum lambda3() {
        return Lit4;
    }

    static IntNum lambda4() {
        return Lit4;
    }

    static Object lambda5() {
        return runtime.callYailPrimitive(runtime.get$Mnstart$Mnvalue, LList.Empty, LList.Empty, "get start value");
    }

    static String lambda6() {
        return "Nothing";
    }

    static IntNum lambda7() {
        return Lit9;
    }

    static Object lambda8() {
        runtime.setAndCoerceProperty$Ex(Lit0, Lit10, "LazarilloSITPV1", Lit11);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit12, Boolean.FALSE, Lit13);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit14, "misDestinos", Lit11);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit15, Boolean.FALSE, Lit13);
    }

    public Object misDestinos$Initialize() {
        runtime.setThisForm();
        runtime.callComponentMethod(Lit16, Lit17, LList.Empty, LList.Empty);
        runtime.setAndCoerceProperty$Ex(Lit18, Lit19, Boolean.TRUE, Lit13);
        runtime.addGlobalVarToCurrentFormEnvironment(Lit8, runtime.callComponentMethod(Lit20, Lit21, LList.list2("InicializarE", "-1"), Lit22));
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit8, runtime.$Stthe$Mnnull$Mnvalue$St), Lit9), Lit23, "=") == Boolean.FALSE) {
            return Values.empty;
        }
        runtime.callComponentMethod(Lit20, Lit24, LList.list2("NombreAdmin", "Andrés MurciaTorres"), Lit25);
        runtime.callComponentMethod(Lit20, Lit24, LList.list2("CorreoAdmin", "andres.murcia.uz@gmail.com"), Lit26);
        runtime.callComponentMethod(Lit20, Lit24, LList.list2("E1Alias", "Av Rojas con 53 sentido norte"), Lit27);
        runtime.callComponentMethod(Lit20, Lit24, LList.list2("E1Nombre", "Parada 167A05"), Lit28);
        runtime.callComponentMethod(Lit20, Lit24, LList.list2("E1Latitud", Lit29), Lit30);
        runtime.callComponentMethod(Lit20, Lit24, LList.list2("E1Longitud", Lit31), Lit32);
        runtime.callComponentMethod(Lit20, Lit24, LList.list2("E2Alias", "Rojas con 57 sentido sur"), Lit33);
        runtime.callComponentMethod(Lit20, Lit24, LList.list2("E2Nombre", "Parada 166A05"), Lit34);
        runtime.callComponentMethod(Lit20, Lit24, LList.list2("E2Latitud", Lit35), Lit36);
        runtime.callComponentMethod(Lit20, Lit24, LList.list2("E2Longitud", Lit37), Lit38);
        runtime.callComponentMethod(Lit20, Lit24, LList.list2("E3Alias", "Calle 52"), Lit39);
        runtime.callComponentMethod(Lit20, Lit24, LList.list2("E3Nombre", "Parada 099A05"), Lit40);
        runtime.callComponentMethod(Lit20, Lit24, LList.list2("E3Latitud", Lit41), Lit42);
        runtime.callComponentMethod(Lit20, Lit24, LList.list2("E3Longitud", Lit43), Lit44);
        return runtime.callComponentMethod(Lit20, Lit24, LList.list2("InicializarE", Lit4), Lit45);
    }

    static Object lambda10() {
        runtime.setAndCoerceProperty$Ex(Lit49, Lit50, "Lazarillo_Fondo.JPG", Lit11);
        runtime.setAndCoerceProperty$Ex(Lit49, Lit51, Lit52, Lit53);
        return runtime.setAndCoerceProperty$Ex(Lit49, Lit54, Lit52, Lit53);
    }

    static Object lambda9() {
        runtime.setAndCoerceProperty$Ex(Lit49, Lit50, "Lazarillo_Fondo.JPG", Lit11);
        runtime.setAndCoerceProperty$Ex(Lit49, Lit51, Lit52, Lit53);
        return runtime.setAndCoerceProperty$Ex(Lit49, Lit54, Lit52, Lit53);
    }

    public Object Canvas1$Flung(Object $x, Object $y, Object $speed, Object $heading, Object $xvel, Object $yvel, Object $flungSprite) {
        frame0 appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame0 = new frame0();
        runtime.sanitizeComponentData($x);
        runtime.sanitizeComponentData($y);
        runtime.sanitizeComponentData($speed);
        Object sanitizeComponentData = runtime.sanitizeComponentData($heading);
        runtime.sanitizeComponentData($xvel);
        runtime.sanitizeComponentData($yvel);
        runtime.sanitizeComponentData($flungSprite);
        appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame0.$heading = sanitizeComponentData;
        runtime.setThisForm();
        NumberCompare numberCompare = Scheme.numLss;
        ModuleMethod moduleMethod = numbers.abs;
        if (appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame0.$heading instanceof Package) {
            sanitizeComponentData = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit56), " is not bound in the current context"), "Unbound Variable");
        } else {
            sanitizeComponentData = appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame0.$heading;
        }
        if (runtime.callYailPrimitive(numberCompare, LList.list2(runtime.callYailPrimitive(moduleMethod, LList.list1(sanitizeComponentData), Lit57, "abs"), Lit58), Lit59, "<") != Boolean.FALSE) {
            runtime.callComponentMethod(Lit16, Lit60, LList.Empty, LList.Empty);
            runtime.callComponentMethod(Lit61, Lit62, LList.Empty, Lit63);
            runtime.addGlobalVarToCurrentFormEnvironment(Lit7, "derecha");
            runtime.callComponentMethod(Lit61, Lit62, LList.list1(runtime.callComponentMethod(Lit20, Lit21, LList.list2("E1Alias", ""), Lit64)), Lit65);
            SimpleSymbol simpleSymbol = Lit66;
            SimpleSymbol simpleSymbol2 = Lit67;
            moduleMethod = strings.string$Mnappend;
            Pair list1 = LList.list1("https://www.google.com/maps/dir/?api=1&");
            LList.chain1(LList.chain1(LList.chain4(list1, runtime.lookupGlobalVarInCurrentFormEnvironment(Lit6, runtime.$Stthe$Mnnull$Mnvalue$St), "&destination=", runtime.callComponentMethod(Lit20, Lit21, LList.list2("E1Latitud", ""), Lit68), ","), runtime.callComponentMethod(Lit20, Lit21, LList.list2("E1Longitud", ""), Lit69)), "&sensor=false&mode=walking&key=AIzaSyA4NemmESsiRmchjMzYayNh68vG8DgexjA");
            runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, runtime.callYailPrimitive(moduleMethod, list1, Lit70, "join"), Lit11);
            runtime.setAndCoerceProperty$Ex(Lit71, Lit72, "https://maker.ifttt.com/trigger/Sendmail/with/key/kr2pZjXjlQi12M9DLRVHk9Jq2x8kQNaQjbrXfhXdKY7", Lit11);
            runtime.setAndCoerceProperty$Ex(Lit71, Lit73, runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.list1(runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.list2("Content-Type", "application/json"), Lit74, "make a list")), Lit75, "make a list"), Lit76);
            simpleSymbol = Lit71;
            simpleSymbol2 = Lit77;
            moduleMethod = strings.string$Mnappend;
            list1 = LList.list1("{\"value1\" : \"");
            LList.chain1(LList.chain1(LList.chain4(list1, runtime.callComponentMethod(Lit20, Lit21, LList.list2("CorreoAdmin", ""), Lit78), "\", \"value2\" : \"", runtime.callComponentMethod(Lit18, Lit79, LList.list2(runtime.callComponentMethod(Lit18, Lit80, LList.Empty, LList.Empty), "MM/dd/yyyy hh:mm:ss a"), Lit81), "\", \"value3\" : \""), runtime.getProperty$1(Lit66, Lit67)), "\"}");
            runtime.callComponentMethod(simpleSymbol, simpleSymbol2, LList.list1(runtime.callYailPrimitive(moduleMethod, list1, Lit82, "join")), Lit83);
            runtime.callComponentMethod(Lit66, Lit84, LList.Empty, LList.Empty);
            runtime.setAndCoerceProperty$Ex(Lit18, Lit19, Boolean.FALSE, Lit13);
            runtime.setAndCoerceProperty$Ex(Lit85, Lit19, Boolean.FALSE, Lit13);
        }
        numberCompare = Scheme.numGrt;
        moduleMethod = numbers.abs;
        if (appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame0.$heading instanceof Package) {
            sanitizeComponentData = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit56), " is not bound in the current context"), "Unbound Variable");
        } else {
            sanitizeComponentData = appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame0.$heading;
        }
        if (runtime.callYailPrimitive(numberCompare, LList.list2(runtime.callYailPrimitive(moduleMethod, LList.list1(sanitizeComponentData), Lit86, "abs"), Lit87), Lit88, ">") != Boolean.FALSE) {
            runtime.addGlobalVarToCurrentFormEnvironment(Lit7, "izquierda");
            runtime.callComponentMethod(Lit61, Lit62, LList.list1(runtime.callComponentMethod(Lit20, Lit21, LList.list2("E2Alias", ""), Lit89)), Lit90);
            simpleSymbol = Lit66;
            simpleSymbol2 = Lit67;
            moduleMethod = strings.string$Mnappend;
            list1 = LList.list1("https://www.google.com/maps/dir/?api=1&");
            LList.chain1(LList.chain1(LList.chain4(list1, runtime.lookupGlobalVarInCurrentFormEnvironment(Lit6, runtime.$Stthe$Mnnull$Mnvalue$St), "&destination=", runtime.callComponentMethod(Lit20, Lit21, LList.list2("E2Latitud", ""), Lit91), ","), runtime.callComponentMethod(Lit20, Lit21, LList.list2("E2Longitud", ""), Lit92)), "&sensor=false&mode=walking&key=AIzaSyA4NemmESsiRmchjMzYayNh68vG8DgexjA");
            runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol2, runtime.callYailPrimitive(moduleMethod, list1, Lit93, "join"), Lit11);
            runtime.setAndCoerceProperty$Ex(Lit71, Lit72, "https://maker.ifttt.com/trigger/Sendmail/with/key/kr2pZjXjlQi12M9DLRVHk9Jq2x8kQNaQjbrXfhXdKY7", Lit11);
            runtime.setAndCoerceProperty$Ex(Lit71, Lit73, runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.list1(runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.list2("Content-Type", "application/json"), Lit94, "make a list")), Lit95, "make a list"), Lit76);
            simpleSymbol = Lit71;
            simpleSymbol2 = Lit77;
            moduleMethod = strings.string$Mnappend;
            list1 = LList.list1("{\"value1\" : \"");
            LList.chain1(LList.chain1(LList.chain4(list1, runtime.callComponentMethod(Lit20, Lit21, LList.list2("CorreoAdmin", ""), Lit96), "\", \"value2\" : \"", runtime.callComponentMethod(Lit18, Lit79, LList.list2(runtime.callComponentMethod(Lit18, Lit80, LList.Empty, LList.Empty), "MM/dd/yyyy hh:mm:ss a"), Lit97), "\", \"value3\" : \""), runtime.getProperty$1(Lit66, Lit67)), "\"}");
            runtime.callComponentMethod(simpleSymbol, simpleSymbol2, LList.list1(runtime.callYailPrimitive(moduleMethod, list1, Lit98, "join")), Lit99);
            runtime.callComponentMethod(Lit66, Lit84, LList.Empty, LList.Empty);
            runtime.setAndCoerceProperty$Ex(Lit18, Lit19, Boolean.FALSE, Lit13);
            runtime.setAndCoerceProperty$Ex(Lit85, Lit19, Boolean.FALSE, Lit13);
        }
        if (runtime.processAndDelayed$V(new Object[]{appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame0.lambda$Fn10, appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame0.lambda$Fn11}) != Boolean.FALSE) {
            runtime.addGlobalVarToCurrentFormEnvironment(Lit7, "arriba");
            runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen, LList.list1("AdminEst"), Lit102, "open another screen");
        }
        if (runtime.processAndDelayed$V(new Object[]{appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame0.lambda$Fn12, appinventor_ai_andres_murciat_Lazarillo_misDestinos_frame0.lambda$Fn13}) == Boolean.FALSE) {
            return Values.empty;
        }
        runtime.addGlobalVarToCurrentFormEnvironment(Lit7, "abajo");
        runtime.callComponentMethod(Lit61, Lit62, LList.list1(runtime.callComponentMethod(Lit20, Lit21, LList.list2("E3Alias", ""), Lit107)), Lit108);
        simpleSymbol = Lit66;
        SimpleSymbol simpleSymbol3 = Lit67;
        ModuleMethod moduleMethod2 = strings.string$Mnappend;
        Pair list12 = LList.list1("https://www.google.com/maps/dir/?api=1&");
        LList.chain1(LList.chain1(LList.chain4(list12, runtime.lookupGlobalVarInCurrentFormEnvironment(Lit6, runtime.$Stthe$Mnnull$Mnvalue$St), "&destination=", runtime.callComponentMethod(Lit20, Lit21, LList.list2("E3Latitud", ""), Lit109), ","), runtime.callComponentMethod(Lit20, Lit21, LList.list2("E3Longitud", ""), Lit110)), "&sensor=false&mode=walking&key=AIzaSyA4NemmESsiRmchjMzYayNh68vG8DgexjA");
        runtime.setAndCoerceProperty$Ex(simpleSymbol, simpleSymbol3, runtime.callYailPrimitive(moduleMethod2, list12, Lit111, "join"), Lit11);
        runtime.setAndCoerceProperty$Ex(Lit71, Lit72, "https://maker.ifttt.com/trigger/Sendmail/with/key/kr2pZjXjlQi12M9DLRVHk9Jq2x8kQNaQjbrXfhXdKY7", Lit11);
        runtime.setAndCoerceProperty$Ex(Lit71, Lit73, runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.list1(runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.list2("Content-Type", "application/json"), Lit112, "make a list")), Lit113, "make a list"), Lit76);
        simpleSymbol = Lit71;
        simpleSymbol3 = Lit77;
        moduleMethod2 = strings.string$Mnappend;
        list12 = LList.list1("{\"value1\" : \"");
        LList.chain1(LList.chain1(LList.chain4(list12, runtime.callComponentMethod(Lit20, Lit21, LList.list2("CorreoAdmin", ""), Lit114), "\", \"value2\" : \"", runtime.callComponentMethod(Lit18, Lit79, LList.list2(runtime.callComponentMethod(Lit18, Lit80, LList.Empty, LList.Empty), "MM/dd/yyyy hh:mm:ss a"), Lit115), "\", \"value3\" : \""), runtime.getProperty$1(Lit66, Lit67)), "\"}");
        runtime.callComponentMethod(simpleSymbol, simpleSymbol3, LList.list1(runtime.callYailPrimitive(moduleMethod2, list12, Lit116, "join")), Lit117);
        runtime.callComponentMethod(Lit66, Lit84, LList.Empty, LList.Empty);
        runtime.setAndCoerceProperty$Ex(Lit18, Lit19, Boolean.FALSE, Lit13);
        return runtime.setAndCoerceProperty$Ex(Lit85, Lit19, Boolean.FALSE, Lit13);
    }

    static Object lambda15() {
        return runtime.setAndCoerceProperty$Ex(Lit16, Lit123, "misDestinos.m4a", Lit11);
    }

    static Object lambda16() {
        return runtime.setAndCoerceProperty$Ex(Lit16, Lit123, "misDestinos.m4a", Lit11);
    }

    static Object lambda17() {
        runtime.setAndCoerceProperty$Ex(Lit18, Lit19, Boolean.FALSE, Lit13);
        return runtime.setAndCoerceProperty$Ex(Lit18, Lit126, Lit127, Lit53);
    }

    static Object lambda18() {
        runtime.setAndCoerceProperty$Ex(Lit18, Lit19, Boolean.FALSE, Lit13);
        return runtime.setAndCoerceProperty$Ex(Lit18, Lit126, Lit127, Lit53);
    }

    public Object Clock1$Timer() {
        runtime.setThisForm();
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit5, runtime.$Stthe$Mnnull$Mnvalue$St), Lit4), Lit129, "=") != Boolean.FALSE) {
            runtime.setAndCoerceProperty$Ex(Lit16, Lit123, "misDestinos2.m4a", Lit11);
            runtime.callComponentMethod(Lit16, Lit17, LList.Empty, LList.Empty);
            runtime.setAndCoerceProperty$Ex(Lit18, Lit19, Boolean.FALSE, Lit13);
            return runtime.setAndCoerceProperty$Ex(Lit85, Lit19, Boolean.TRUE, Lit13);
        } else if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit5, runtime.$Stthe$Mnnull$Mnvalue$St), Lit130), Lit131, "=") == Boolean.FALSE) {
            return Values.empty;
        } else {
            runtime.callComponentMethod(Lit61, Lit62, LList.list1(runtime.callYailPrimitive(strings.string$Mnappend, LList.list2("A la izquierda irás a", runtime.callComponentMethod(Lit20, Lit21, LList.list2("E2Alias", ""), Lit132)), Lit133, "join")), Lit134);
            runtime.setAndCoerceProperty$Ex(Lit18, Lit19, Boolean.FALSE, Lit13);
            return runtime.setAndCoerceProperty$Ex(Lit85, Lit19, Boolean.TRUE, Lit13);
        }
    }

    static Object lambda19() {
        runtime.setAndCoerceProperty$Ex(Lit85, Lit19, Boolean.FALSE, Lit13);
        return runtime.setAndCoerceProperty$Ex(Lit85, Lit126, Lit138, Lit53);
    }

    static Object lambda20() {
        runtime.setAndCoerceProperty$Ex(Lit85, Lit19, Boolean.FALSE, Lit13);
        return runtime.setAndCoerceProperty$Ex(Lit85, Lit126, Lit138, Lit53);
    }

    public Object Clock2$Timer() {
        runtime.setThisForm();
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit5, runtime.$Stthe$Mnnull$Mnvalue$St), Lit4), Lit140, "=") != Boolean.FALSE) {
            runtime.callComponentMethod(Lit61, Lit62, LList.list1(runtime.callYailPrimitive(strings.string$Mnappend, LList.list2("A la derecha irás a", runtime.callComponentMethod(Lit20, Lit21, LList.list2("E1Alias", ""), Lit141)), Lit142, "join")), Lit143);
            runtime.addGlobalVarToCurrentFormEnvironment(Lit5, Lit130);
            runtime.setAndCoerceProperty$Ex(Lit85, Lit19, Boolean.FALSE, Lit13);
            return runtime.setAndCoerceProperty$Ex(Lit18, Lit19, Boolean.TRUE, Lit13);
        } else if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit5, runtime.$Stthe$Mnnull$Mnvalue$St), Lit130), Lit144, "=") == Boolean.FALSE) {
            return Values.empty;
        } else {
            runtime.callComponentMethod(Lit61, Lit62, LList.list1(runtime.callYailPrimitive(strings.string$Mnappend, LList.list2("Hacia abajo irás a", runtime.callComponentMethod(Lit20, Lit21, LList.list2("E3Alias", ""), Lit145)), Lit146, "join")), Lit147);
            return runtime.setAndCoerceProperty$Ex(Lit85, Lit19, Boolean.FALSE, Lit13);
        }
    }

    static Object lambda21() {
        return runtime.setAndCoerceProperty$Ex(Lit66, Lit152, "android.intent.action.VIEW", Lit11);
    }

    static Object lambda22() {
        return runtime.setAndCoerceProperty$Ex(Lit66, Lit152, "android.intent.action.VIEW", Lit11);
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
        misDestinos = this;
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
        misDestinos closureEnv = this;
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
