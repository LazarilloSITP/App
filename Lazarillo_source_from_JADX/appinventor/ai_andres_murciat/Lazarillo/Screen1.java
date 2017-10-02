package appinventor.ai_andres_murciat.Lazarillo;

import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.Canvas;
import com.google.appinventor.components.runtime.Clock;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.LocationSensor;
import com.google.appinventor.components.runtime.Player;
import com.google.appinventor.components.runtime.TextToSpeech;
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
import gnu.math.DFloNum;
import gnu.math.IntNum;
import kawa.lang.Promise;
import kawa.lib.lists;
import kawa.lib.misc;
import kawa.lib.numbers;
import kawa.lib.strings;
import kawa.standard.Scheme;
import kawa.standard.require;

/* compiled from: Screen1.yail */
public class Screen1 extends Form implements Runnable {
    static final SimpleSymbol Lit0 = ((SimpleSymbol) new SimpleSymbol("Screen1").readResolve());
    static final SimpleSymbol Lit1 = ((SimpleSymbol) new SimpleSymbol("getMessage").readResolve());
    static final SimpleSymbol Lit10 = ((SimpleSymbol) new SimpleSymbol("Title").readResolve());
    static final SimpleSymbol Lit100 = ((SimpleSymbol) new SimpleSymbol("lookup-in-form-environment").readResolve());
    static final SimpleSymbol Lit101 = ((SimpleSymbol) new SimpleSymbol("is-bound-in-form-environment").readResolve());
    static final SimpleSymbol Lit102 = ((SimpleSymbol) new SimpleSymbol("add-to-global-var-environment").readResolve());
    static final SimpleSymbol Lit103 = ((SimpleSymbol) new SimpleSymbol("add-to-events").readResolve());
    static final SimpleSymbol Lit104 = ((SimpleSymbol) new SimpleSymbol("add-to-components").readResolve());
    static final SimpleSymbol Lit105 = ((SimpleSymbol) new SimpleSymbol("add-to-global-vars").readResolve());
    static final SimpleSymbol Lit106 = ((SimpleSymbol) new SimpleSymbol("add-to-form-do-after-creation").readResolve());
    static final SimpleSymbol Lit107 = ((SimpleSymbol) new SimpleSymbol("send-error").readResolve());
    static final SimpleSymbol Lit108 = ((SimpleSymbol) new SimpleSymbol("dispatchEvent").readResolve());
    static final SimpleSymbol Lit109 = ((SimpleSymbol) new SimpleSymbol("lookup-handler").readResolve());
    static final SimpleSymbol Lit11 = ((SimpleSymbol) new SimpleSymbol("TitleVisible").readResolve());
    static final SimpleSymbol Lit110 = ((SimpleSymbol) new SimpleSymbol("any").readResolve());
    static final SimpleSymbol Lit12 = ((SimpleSymbol) new SimpleSymbol("Player1").readResolve());
    static final SimpleSymbol Lit13 = ((SimpleSymbol) new SimpleSymbol("Start").readResolve());
    static final SimpleSymbol Lit14 = ((SimpleSymbol) new SimpleSymbol("Screen1$Initialize").readResolve());
    static final SimpleSymbol Lit15 = ((SimpleSymbol) new SimpleSymbol("Initialize").readResolve());
    static final FString Lit16 = new FString("com.google.appinventor.components.runtime.Canvas");
    static final SimpleSymbol Lit17 = ((SimpleSymbol) new SimpleSymbol("Canvas1").readResolve());
    static final SimpleSymbol Lit18 = ((SimpleSymbol) new SimpleSymbol("BackgroundImage").readResolve());
    static final SimpleSymbol Lit19 = ((SimpleSymbol) new SimpleSymbol("Height").readResolve());
    static final SimpleSymbol Lit2 = ((SimpleSymbol) new SimpleSymbol("*the-null-value*").readResolve());
    static final IntNum Lit20 = IntNum.make(-2);
    static final SimpleSymbol Lit21;
    static final SimpleSymbol Lit22 = ((SimpleSymbol) new SimpleSymbol("Width").readResolve());
    static final SimpleSymbol Lit23 = ((SimpleSymbol) new SimpleSymbol("LineWidth").readResolve());
    static final DFloNum Lit24 = DFloNum.make(1.0d);
    static final FString Lit25 = new FString("com.google.appinventor.components.runtime.Canvas");
    static final IntNum Lit26 = IntNum.make(1);
    static final PairWithPosition Lit27 = PairWithPosition.make(Lit110, PairWithPosition.make(Lit110, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/Screen1.yail", 139357), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/Screen1.yail", 139352);
    static final SimpleSymbol Lit28 = ((SimpleSymbol) new SimpleSymbol("$heading").readResolve());
    static final PairWithPosition Lit29 = PairWithPosition.make(Lit21, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/Screen1.yail", 139495);
    static final SimpleSymbol Lit3 = ((SimpleSymbol) new SimpleSymbol("g$sn_gotLat").readResolve());
    static final IntNum Lit30 = IntNum.make(45);
    static final PairWithPosition Lit31 = PairWithPosition.make(Lit21, PairWithPosition.make(Lit21, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/Screen1.yail", 139524), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/Screen1.yail", 139516);
    static final SimpleSymbol Lit32 = ((SimpleSymbol) new SimpleSymbol("Stop").readResolve());
    static final SimpleSymbol Lit33 = ((SimpleSymbol) new SimpleSymbol("lbLatitud").readResolve());
    static final SimpleSymbol Lit34 = ((SimpleSymbol) new SimpleSymbol("Text").readResolve());
    static final SimpleSymbol Lit35 = ((SimpleSymbol) new SimpleSymbol("lbLongitud").readResolve());
    static final PairWithPosition Lit36 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, PairWithPosition.make(Lit7, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/Screen1.yail", 139886), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/Screen1.yail", 139881), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/Screen1.yail", 139876), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/Screen1.yail", 139870);
    static final PairWithPosition Lit37 = PairWithPosition.make(Lit7, PairWithPosition.make(Lit110, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/Screen1.yail", 139909), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/Screen1.yail", 139903);
    static final PairWithPosition Lit38 = PairWithPosition.make(Lit21, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/Screen1.yail", 140074);
    static final IntNum Lit39 = IntNum.make(135);
    static final IntNum Lit4 = IntNum.make(0);
    static final PairWithPosition Lit40 = PairWithPosition.make(Lit21, PairWithPosition.make(Lit21, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/Screen1.yail", 140104), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/Screen1.yail", 140096);
    static final SimpleSymbol Lit41 = ((SimpleSymbol) new SimpleSymbol("TextToSpeech1").readResolve());
    static final SimpleSymbol Lit42 = ((SimpleSymbol) new SimpleSymbol("Speak").readResolve());
    static final PairWithPosition Lit43 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/Screen1.yail", 140314);
    static final IntNum Lit44 = IntNum.make(-45);
    static final PairWithPosition Lit45 = PairWithPosition.make(Lit21, PairWithPosition.make(Lit21, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/Screen1.yail", 140423), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/Screen1.yail", 140415);
    static final IntNum Lit46 = IntNum.make(-135);
    static final PairWithPosition Lit47 = PairWithPosition.make(Lit21, PairWithPosition.make(Lit21, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/Screen1.yail", 140521), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/Screen1.yail", 140513);
    static final PairWithPosition Lit48 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/Screen1.yail", 140655);
    static final PairWithPosition Lit49 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/Screen1.yail", 140816);
    static final SimpleSymbol Lit5 = ((SimpleSymbol) new SimpleSymbol("g$Seleccion").readResolve());
    static final PairWithPosition Lit50 = PairWithPosition.make(Lit21, PairWithPosition.make(Lit21, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/Screen1.yail", 140924), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/Screen1.yail", 140916);
    static final PairWithPosition Lit51;
    static final PairWithPosition Lit52 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/Screen1.yail", 141230);
    static final PairWithPosition Lit53 = PairWithPosition.make(Lit7, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/Screen1.yail", 141337);
    static final SimpleSymbol Lit54 = ((SimpleSymbol) new SimpleSymbol("Canvas1$Flung").readResolve());
    static final SimpleSymbol Lit55 = ((SimpleSymbol) new SimpleSymbol("Flung").readResolve());
    static final FString Lit56 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final SimpleSymbol Lit57 = ((SimpleSymbol) new SimpleSymbol("HorizontalArrangement1").readResolve());
    static final FString Lit58 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    static final FString Lit59 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit6 = ((SimpleSymbol) new SimpleSymbol("AppName").readResolve());
    static final SimpleSymbol Lit60 = ((SimpleSymbol) new SimpleSymbol("lbDireccion").readResolve());
    static final FString Lit61 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit62 = new FString("com.google.appinventor.components.runtime.Label");
    static final SimpleSymbol Lit63 = ((SimpleSymbol) new SimpleSymbol("Visible").readResolve());
    static final FString Lit64 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit65 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit66 = new FString("com.google.appinventor.components.runtime.Label");
    static final FString Lit67 = new FString("com.google.appinventor.components.runtime.TextToSpeech");
    static final SimpleSymbol Lit68 = ((SimpleSymbol) new SimpleSymbol("Language").readResolve());
    static final FString Lit69 = new FString("com.google.appinventor.components.runtime.TextToSpeech");
    static final SimpleSymbol Lit7;
    static final FString Lit70 = new FString("com.google.appinventor.components.runtime.Player");
    static final SimpleSymbol Lit71 = ((SimpleSymbol) new SimpleSymbol("Source").readResolve());
    static final FString Lit72 = new FString("com.google.appinventor.components.runtime.Player");
    static final FString Lit73 = new FString("com.google.appinventor.components.runtime.LocationSensor");
    static final SimpleSymbol Lit74 = ((SimpleSymbol) new SimpleSymbol("LocationSensor1").readResolve());
    static final SimpleSymbol Lit75 = ((SimpleSymbol) new SimpleSymbol("TimeInterval").readResolve());
    static final IntNum Lit76 = IntNum.make(1000);
    static final FString Lit77 = new FString("com.google.appinventor.components.runtime.LocationSensor");
    static final PairWithPosition Lit78 = PairWithPosition.make(Lit110, PairWithPosition.make(Lit110, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/Screen1.yail", 356445), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/Screen1.yail", 356440);
    static final SimpleSymbol Lit79 = ((SimpleSymbol) new SimpleSymbol("CurrentAddress").readResolve());
    static final SimpleSymbol Lit8 = ((SimpleSymbol) new SimpleSymbol("ShowStatusBar").readResolve());
    static final SimpleSymbol Lit80 = ((SimpleSymbol) new SimpleSymbol("Latitude").readResolve());
    static final SimpleSymbol Lit81 = ((SimpleSymbol) new SimpleSymbol("Longitude").readResolve());
    static final SimpleSymbol Lit82 = ((SimpleSymbol) new SimpleSymbol("Clock1").readResolve());
    static final SimpleSymbol Lit83 = ((SimpleSymbol) new SimpleSymbol("TimerEnabled").readResolve());
    static final SimpleSymbol Lit84 = ((SimpleSymbol) new SimpleSymbol("LocationSensor1$LocationChanged").readResolve());
    static final SimpleSymbol Lit85 = ((SimpleSymbol) new SimpleSymbol("LocationChanged").readResolve());
    static final FString Lit86 = new FString("com.google.appinventor.components.runtime.Clock");
    static final SimpleSymbol Lit87 = ((SimpleSymbol) new SimpleSymbol("TimerInterval").readResolve());
    static final IntNum Lit88 = IntNum.make(4000);
    static final FString Lit89 = new FString("com.google.appinventor.components.runtime.Clock");
    static final SimpleSymbol Lit9 = ((SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_BOOLEAN).readResolve());
    static final PairWithPosition Lit90;
    static final SimpleSymbol Lit91 = ((SimpleSymbol) new SimpleSymbol("Clock2").readResolve());
    static final SimpleSymbol Lit92 = ((SimpleSymbol) new SimpleSymbol("Clock1$Timer").readResolve());
    static final SimpleSymbol Lit93 = ((SimpleSymbol) new SimpleSymbol("Timer").readResolve());
    static final FString Lit94 = new FString("com.google.appinventor.components.runtime.Clock");
    static final IntNum Lit95 = IntNum.make(8000);
    static final FString Lit96 = new FString("com.google.appinventor.components.runtime.Clock");
    static final SimpleSymbol Lit97 = ((SimpleSymbol) new SimpleSymbol("Clock2$Timer").readResolve());
    static final SimpleSymbol Lit98 = ((SimpleSymbol) new SimpleSymbol("android-log-form").readResolve());
    static final SimpleSymbol Lit99 = ((SimpleSymbol) new SimpleSymbol("add-to-form-environment").readResolve());
    public static Screen1 Screen1;
    static final ModuleMethod lambda$Fn1 = null;
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
    static final ModuleMethod lambda$Fn3 = null;
    static final ModuleMethod lambda$Fn4 = null;
    static final ModuleMethod lambda$Fn5 = null;
    static final ModuleMethod lambda$Fn6 = null;
    public Boolean $Stdebug$Mnform$St;
    public final ModuleMethod $define;
    public Canvas Canvas1;
    public final ModuleMethod Canvas1$Flung;
    public Clock Clock1;
    public final ModuleMethod Clock1$Timer;
    public Clock Clock2;
    public final ModuleMethod Clock2$Timer;
    public HorizontalArrangement HorizontalArrangement1;
    public LocationSensor LocationSensor1;
    public final ModuleMethod LocationSensor1$LocationChanged;
    public Player Player1;
    public final ModuleMethod Screen1$Initialize;
    public TextToSpeech TextToSpeech1;
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
    public Label lbDireccion;
    public Label lbLatitud;
    public Label lbLongitud;
    public final ModuleMethod lookup$Mnhandler;
    public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
    public final ModuleMethod process$Mnexception;
    public final ModuleMethod send$Mnerror;

    /* compiled from: Screen1.yail */
    public class frame0 extends ModuleBody {
        Object $heading;
        final ModuleMethod lambda$Fn10 = new ModuleMethod(this, 4, null, 0);
        final ModuleMethod lambda$Fn7 = new ModuleMethod(this, 1, null, 0);
        final ModuleMethod lambda$Fn8 = new ModuleMethod(this, 2, null, 0);
        final ModuleMethod lambda$Fn9 = new ModuleMethod(this, 3, null, 0);

        public Object apply0(ModuleMethod moduleMethod) {
            switch (moduleMethod.selector) {
                case 1:
                    return lambda8();
                case 2:
                    return lambda9();
                case 3:
                    return lambda10();
                case 4:
                    return lambda11();
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

        Object lambda10() {
            Object signalRuntimeError;
            NumberCompare numberCompare = Scheme.numGEq;
            if (this.$heading instanceof Package) {
                signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Screen1.Lit28), " is not bound in the current context"), "Unbound Variable");
            } else {
                signalRuntimeError = this.$heading;
            }
            return runtime.callYailPrimitive(numberCompare, LList.list2(signalRuntimeError, Screen1.Lit30), Screen1.Lit50, ">=");
        }

        Object lambda11() {
            Object signalRuntimeError;
            NumberCompare numberCompare = Scheme.numLEq;
            if (this.$heading instanceof Package) {
                signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Screen1.Lit28), " is not bound in the current context"), "Unbound Variable");
            } else {
                signalRuntimeError = this.$heading;
            }
            return runtime.callYailPrimitive(numberCompare, LList.list2(signalRuntimeError, Screen1.Lit39), Screen1.Lit51, "<=");
        }

        Object lambda8() {
            Object signalRuntimeError;
            NumberCompare numberCompare = Scheme.numLEq;
            if (this.$heading instanceof Package) {
                signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Screen1.Lit28), " is not bound in the current context"), "Unbound Variable");
            } else {
                signalRuntimeError = this.$heading;
            }
            return runtime.callYailPrimitive(numberCompare, LList.list2(signalRuntimeError, Screen1.Lit44), Screen1.Lit45, "<=");
        }

        Object lambda9() {
            Object signalRuntimeError;
            NumberCompare numberCompare = Scheme.numGEq;
            if (this.$heading instanceof Package) {
                signalRuntimeError = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Screen1.Lit28), " is not bound in the current context"), "Unbound Variable");
            } else {
                signalRuntimeError = this.$heading;
            }
            return runtime.callYailPrimitive(numberCompare, LList.list2(signalRuntimeError, Screen1.Lit46), Screen1.Lit47, ">=");
        }
    }

    /* compiled from: Screen1.yail */
    public class frame extends ModuleBody {
        Screen1 $main = this;

        public Object applyN(ModuleMethod moduleMethod, Object[] objArr) {
            return moduleMethod.selector == 27 ? this.$main.Canvas1$Flung(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6]) : super.applyN(moduleMethod, objArr);
        }

        public int matchN(ModuleMethod moduleMethod, Object[] objArr, CallContext callContext) {
            if (moduleMethod.selector != 27) {
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
                    if (!(obj instanceof Screen1)) {
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
                    if (!(obj instanceof Screen1)) {
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
                case 40:
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
                case 40:
                    return this.$main.LocationSensor1$LocationChanged(obj, obj2, obj3, obj4);
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
                    return Screen1.lambda2();
                case 20:
                    this.$main.$define();
                    return Values.empty;
                case 21:
                    return Screen1.lambda3();
                case 22:
                    return Screen1.lambda4();
                case 23:
                    return Screen1.lambda5();
                case 24:
                    return this.$main.Screen1$Initialize();
                case 25:
                    return Screen1.lambda6();
                case 26:
                    return Screen1.lambda7();
                case 28:
                    return Screen1.lambda12();
                case 29:
                    return Screen1.lambda13();
                case 30:
                    return Screen1.lambda14();
                case 31:
                    return Screen1.lambda15();
                case 32:
                    return Screen1.lambda16();
                case 33:
                    return Screen1.lambda17();
                case 34:
                    return Screen1.lambda18();
                case 35:
                    return Screen1.lambda19();
                case 36:
                    return Screen1.lambda20();
                case 37:
                    return Screen1.lambda21();
                case 38:
                    return Screen1.lambda22();
                case 39:
                    return Screen1.lambda23();
                case 41:
                    return Screen1.lambda24();
                case XDataType.NMTOKEN_TYPE_CODE /*42*/:
                    return Screen1.lambda25();
                case XDataType.NAME_TYPE_CODE /*43*/:
                    return this.$main.Clock1$Timer();
                case XDataType.NCNAME_TYPE_CODE /*44*/:
                    return Screen1.lambda26();
                case XDataType.ID_TYPE_CODE /*45*/:
                    return Screen1.lambda27();
                case XDataType.IDREF_TYPE_CODE /*46*/:
                    return this.$main.Clock2$Timer();
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
                default:
                    return super.match0(moduleMethod, callContext);
            }
        }
    }

    static {
        SimpleSymbol simpleSymbol = (SimpleSymbol) new SimpleSymbol(PropertyTypeConstants.PROPERTY_TYPE_TEXT).readResolve();
        Lit7 = simpleSymbol;
        Lit90 = PairWithPosition.make(simpleSymbol, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/Screen1.yail", 401514);
        simpleSymbol = (SimpleSymbol) new SimpleSymbol("number").readResolve();
        Lit21 = simpleSymbol;
        Lit51 = PairWithPosition.make(simpleSymbol, PairWithPosition.make(Lit21, LList.Empty, "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/Screen1.yail", 141021), "/tmp/1506523009805_0.017518472423235676-0/youngandroidproject/../src/appinventor/ai_andres_murciat/Lazarillo/Screen1.yail", 141013);
    }

    public Screen1() {
        ModuleInfo.register(this);
        ModuleBody appinventor_ai_andres_murciat_Lazarillo_Screen1_frame = new frame();
        this.android$Mnlog$Mnform = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_Screen1_frame, 5, Lit98, 4097);
        this.add$Mnto$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_Screen1_frame, 6, Lit99, 8194);
        this.lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_Screen1_frame, 7, Lit100, 8193);
        this.is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_Screen1_frame, 9, Lit101, 4097);
        this.add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_Screen1_frame, 10, Lit102, 8194);
        this.add$Mnto$Mnevents = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_Screen1_frame, 11, Lit103, 8194);
        this.add$Mnto$Mncomponents = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_Screen1_frame, 12, Lit104, 16388);
        this.add$Mnto$Mnglobal$Mnvars = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_Screen1_frame, 13, Lit105, 8194);
        this.add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_Screen1_frame, 14, Lit106, 4097);
        this.send$Mnerror = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_Screen1_frame, 15, Lit107, 4097);
        this.process$Mnexception = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_Screen1_frame, 16, "process-exception", 4097);
        this.dispatchEvent = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_Screen1_frame, 17, Lit108, 16388);
        this.lookup$Mnhandler = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_Screen1_frame, 18, Lit109, 8194);
        PropertySet moduleMethod = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_Screen1_frame, 19, null, 0);
        moduleMethod.setProperty("source-location", "/tmp/runtime4225462389548583421.scm:552");
        lambda$Fn1 = moduleMethod;
        this.$define = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_Screen1_frame, 20, "$define", 0);
        lambda$Fn2 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_Screen1_frame, 21, null, 0);
        lambda$Fn3 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_Screen1_frame, 22, null, 0);
        lambda$Fn4 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_Screen1_frame, 23, null, 0);
        this.Screen1$Initialize = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_Screen1_frame, 24, Lit14, 0);
        lambda$Fn5 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_Screen1_frame, 25, null, 0);
        lambda$Fn6 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_Screen1_frame, 26, null, 0);
        this.Canvas1$Flung = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_Screen1_frame, 27, Lit54, 28679);
        lambda$Fn11 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_Screen1_frame, 28, null, 0);
        lambda$Fn12 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_Screen1_frame, 29, null, 0);
        lambda$Fn13 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_Screen1_frame, 30, null, 0);
        lambda$Fn14 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_Screen1_frame, 31, null, 0);
        lambda$Fn15 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_Screen1_frame, 32, null, 0);
        lambda$Fn16 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_Screen1_frame, 33, null, 0);
        lambda$Fn17 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_Screen1_frame, 34, null, 0);
        lambda$Fn18 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_Screen1_frame, 35, null, 0);
        lambda$Fn19 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_Screen1_frame, 36, null, 0);
        lambda$Fn20 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_Screen1_frame, 37, null, 0);
        lambda$Fn21 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_Screen1_frame, 38, null, 0);
        lambda$Fn22 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_Screen1_frame, 39, null, 0);
        this.LocationSensor1$LocationChanged = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_Screen1_frame, 40, Lit84, 16388);
        lambda$Fn23 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_Screen1_frame, 41, null, 0);
        lambda$Fn24 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_Screen1_frame, 42, null, 0);
        this.Clock1$Timer = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_Screen1_frame, 43, Lit92, 0);
        lambda$Fn25 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_Screen1_frame, 44, null, 0);
        lambda$Fn26 = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_Screen1_frame, 45, null, 0);
        this.Clock2$Timer = new ModuleMethod(appinventor_ai_andres_murciat_Lazarillo_Screen1_frame, 46, Lit97, 0);
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
            Screen1 = null;
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
                    Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit5, "Nothing"), $result);
                } else {
                    addToGlobalVars(Lit5, lambda$Fn3);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit6, "LazarilloSITPV1", Lit7);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit8, Boolean.FALSE, Lit9);
                    runtime.setAndCoerceProperty$Ex(Lit0, Lit10, "Screen1", Lit7);
                    Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit11, Boolean.FALSE, Lit9), $result);
                } else {
                    addToFormDoAfterCreation(new Promise(lambda$Fn4));
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit14, this.Screen1$Initialize);
                } else {
                    addToFormEnvironment(Lit14, this.Screen1$Initialize);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Screen1", "Initialize");
                } else {
                    addToEvents(Lit0, Lit15);
                }
                this.Canvas1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit16, Lit17, lambda$Fn5), $result);
                } else {
                    addToComponents(Lit0, Lit25, Lit17, lambda$Fn6);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit54, this.Canvas1$Flung);
                } else {
                    addToFormEnvironment(Lit54, this.Canvas1$Flung);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Canvas1", "Flung");
                } else {
                    addToEvents(Lit17, Lit55);
                }
                this.HorizontalArrangement1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit56, Lit57, Boolean.FALSE), $result);
                } else {
                    addToComponents(Lit0, Lit58, Lit57, Boolean.FALSE);
                }
                this.lbDireccion = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit57, Lit59, Lit60, lambda$Fn11), $result);
                } else {
                    addToComponents(Lit57, Lit61, Lit60, lambda$Fn12);
                }
                this.lbLatitud = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit57, Lit62, Lit33, lambda$Fn13), $result);
                } else {
                    addToComponents(Lit57, Lit64, Lit33, lambda$Fn14);
                }
                this.lbLongitud = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit57, Lit65, Lit35, lambda$Fn15), $result);
                } else {
                    addToComponents(Lit57, Lit66, Lit35, lambda$Fn16);
                }
                this.TextToSpeech1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit67, Lit41, lambda$Fn17), $result);
                } else {
                    addToComponents(Lit0, Lit69, Lit41, lambda$Fn18);
                }
                this.Player1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit70, Lit12, lambda$Fn19), $result);
                } else {
                    addToComponents(Lit0, Lit72, Lit12, lambda$Fn20);
                }
                this.LocationSensor1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit73, Lit74, lambda$Fn21), $result);
                } else {
                    addToComponents(Lit0, Lit77, Lit74, lambda$Fn22);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit84, this.LocationSensor1$LocationChanged);
                } else {
                    addToFormEnvironment(Lit84, this.LocationSensor1$LocationChanged);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "LocationSensor1", "LocationChanged");
                } else {
                    addToEvents(Lit74, Lit85);
                }
                this.Clock1 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit86, Lit82, lambda$Fn23), $result);
                } else {
                    addToComponents(Lit0, Lit89, Lit82, lambda$Fn24);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit92, this.Clock1$Timer);
                } else {
                    addToFormEnvironment(Lit92, this.Clock1$Timer);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Clock1", "Timer");
                } else {
                    addToEvents(Lit82, Lit93);
                }
                this.Clock2 = null;
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit94, Lit91, lambda$Fn25), $result);
                } else {
                    addToComponents(Lit0, Lit96, Lit91, lambda$Fn26);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    runtime.addToCurrentFormEnvironment(Lit97, this.Clock2$Timer);
                } else {
                    addToFormEnvironment(Lit97, this.Clock2$Timer);
                }
                if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St != Boolean.FALSE) {
                    EventDispatcher.registerEventForDelegation((HandlesEventDispatching) runtime.$Stthis$Mnform$St, "Clock2", "Timer");
                } else {
                    addToEvents(Lit91, Lit93);
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

    static String lambda4() {
        return "Nothing";
    }

    static Object lambda5() {
        runtime.setAndCoerceProperty$Ex(Lit0, Lit6, "LazarilloSITPV1", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit8, Boolean.FALSE, Lit9);
        runtime.setAndCoerceProperty$Ex(Lit0, Lit10, "Screen1", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit0, Lit11, Boolean.FALSE, Lit9);
    }

    public Object Screen1$Initialize() {
        runtime.setThisForm();
        return runtime.callComponentMethod(Lit12, Lit13, LList.Empty, LList.Empty);
    }

    static Object lambda6() {
        runtime.setAndCoerceProperty$Ex(Lit17, Lit18, "Lazarillo_Fondo.JPG", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit17, Lit19, Lit20, Lit21);
        runtime.setAndCoerceProperty$Ex(Lit17, Lit22, Lit20, Lit21);
        return runtime.setAndCoerceProperty$Ex(Lit17, Lit23, Lit24, Lit21);
    }

    static Object lambda7() {
        runtime.setAndCoerceProperty$Ex(Lit17, Lit18, "Lazarillo_Fondo.JPG", Lit7);
        runtime.setAndCoerceProperty$Ex(Lit17, Lit19, Lit20, Lit21);
        runtime.setAndCoerceProperty$Ex(Lit17, Lit22, Lit20, Lit21);
        return runtime.setAndCoerceProperty$Ex(Lit17, Lit23, Lit24, Lit21);
    }

    public Object Canvas1$Flung(Object $x, Object $y, Object $speed, Object $heading, Object $xvel, Object $yvel, Object $flungSprite) {
        frame0 appinventor_ai_andres_murciat_Lazarillo_Screen1_frame0 = new frame0();
        runtime.sanitizeComponentData($x);
        runtime.sanitizeComponentData($y);
        runtime.sanitizeComponentData($speed);
        Object sanitizeComponentData = runtime.sanitizeComponentData($heading);
        runtime.sanitizeComponentData($xvel);
        runtime.sanitizeComponentData($yvel);
        runtime.sanitizeComponentData($flungSprite);
        appinventor_ai_andres_murciat_Lazarillo_Screen1_frame0.$heading = sanitizeComponentData;
        runtime.setThisForm();
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, runtime.$Stthe$Mnnull$Mnvalue$St), Lit26), Lit27, "=") == Boolean.FALSE) {
            return runtime.callComponentMethod(Lit41, Lit42, LList.list1("Espera un momento"), Lit53);
        }
        NumberCompare numberCompare = Scheme.numLss;
        ModuleMethod moduleMethod = numbers.abs;
        if (appinventor_ai_andres_murciat_Lazarillo_Screen1_frame0.$heading instanceof Package) {
            sanitizeComponentData = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit28), " is not bound in the current context"), "Unbound Variable");
        } else {
            sanitizeComponentData = appinventor_ai_andres_murciat_Lazarillo_Screen1_frame0.$heading;
        }
        if (runtime.callYailPrimitive(numberCompare, LList.list2(runtime.callYailPrimitive(moduleMethod, LList.list1(sanitizeComponentData), Lit29, "abs"), Lit30), Lit31, "<") != Boolean.FALSE) {
            runtime.addGlobalVarToCurrentFormEnvironment(Lit5, "derecha");
            runtime.callComponentMethod(Lit12, Lit32, LList.Empty, LList.Empty);
            runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen$Mnwith$Mnstart$Mnvalue, LList.list2("misDestinos", runtime.callYailPrimitive(strings.string$Mnappend, LList.list4("origin=", runtime.getProperty$1(Lit33, Lit34), ",", runtime.getProperty$1(Lit35, Lit34)), Lit36, "join")), Lit37, "open another screen with start value");
        }
        numberCompare = Scheme.numGrt;
        moduleMethod = numbers.abs;
        if (appinventor_ai_andres_murciat_Lazarillo_Screen1_frame0.$heading instanceof Package) {
            sanitizeComponentData = runtime.signalRuntimeError(strings.stringAppend("The variable ", runtime.getDisplayRepresentation(Lit28), " is not bound in the current context"), "Unbound Variable");
        } else {
            sanitizeComponentData = appinventor_ai_andres_murciat_Lazarillo_Screen1_frame0.$heading;
        }
        if (runtime.callYailPrimitive(numberCompare, LList.list2(runtime.callYailPrimitive(moduleMethod, LList.list1(sanitizeComponentData), Lit38, "abs"), Lit39), Lit40, ">") != Boolean.FALSE) {
            runtime.addGlobalVarToCurrentFormEnvironment(Lit5, "izquierda");
            runtime.callComponentMethod(Lit12, Lit32, LList.Empty, LList.Empty);
            runtime.callComponentMethod(Lit41, Lit42, LList.list1("Opción no valida"), Lit43);
        }
        if (runtime.processAndDelayed$V(new Object[]{appinventor_ai_andres_murciat_Lazarillo_Screen1_frame0.lambda$Fn7, appinventor_ai_andres_murciat_Lazarillo_Screen1_frame0.lambda$Fn8}) != Boolean.FALSE) {
            runtime.addGlobalVarToCurrentFormEnvironment(Lit5, "abajo");
            runtime.callComponentMethod(Lit41, Lit42, LList.list1("Tus Sitios"), Lit48);
            runtime.callComponentMethod(Lit12, Lit32, LList.Empty, LList.Empty);
            runtime.callComponentMethod(Lit41, Lit42, LList.list1("Opción no valida"), Lit49);
        }
        if (runtime.processAndDelayed$V(new Object[]{appinventor_ai_andres_murciat_Lazarillo_Screen1_frame0.lambda$Fn9, appinventor_ai_andres_murciat_Lazarillo_Screen1_frame0.lambda$Fn10}) == Boolean.FALSE) {
            return Values.empty;
        }
        runtime.addGlobalVarToCurrentFormEnvironment(Lit5, "arriba");
        runtime.callComponentMethod(Lit12, Lit32, LList.Empty, LList.Empty);
        return runtime.callComponentMethod(Lit41, Lit42, LList.list1("Opción no valida"), Lit52);
    }

    static Object lambda12() {
        return runtime.setAndCoerceProperty$Ex(Lit60, Lit34, "Text for Label1", Lit7);
    }

    static Object lambda13() {
        return runtime.setAndCoerceProperty$Ex(Lit60, Lit34, "Text for Label1", Lit7);
    }

    static Object lambda14() {
        runtime.setAndCoerceProperty$Ex(Lit33, Lit34, "Text for Label2", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit33, Lit63, Boolean.FALSE, Lit9);
    }

    static Object lambda15() {
        runtime.setAndCoerceProperty$Ex(Lit33, Lit34, "Text for Label2", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit33, Lit63, Boolean.FALSE, Lit9);
    }

    static Object lambda16() {
        runtime.setAndCoerceProperty$Ex(Lit35, Lit34, "Text for Label3", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit35, Lit63, Boolean.FALSE, Lit9);
    }

    static Object lambda17() {
        runtime.setAndCoerceProperty$Ex(Lit35, Lit34, "Text for Label3", Lit7);
        return runtime.setAndCoerceProperty$Ex(Lit35, Lit63, Boolean.FALSE, Lit9);
    }

    static Object lambda18() {
        return runtime.setAndCoerceProperty$Ex(Lit41, Lit68, "es", Lit7);
    }

    static Object lambda19() {
        return runtime.setAndCoerceProperty$Ex(Lit41, Lit68, "es", Lit7);
    }

    static Object lambda20() {
        return runtime.setAndCoerceProperty$Ex(Lit12, Lit71, "BienvenidoUbica.m4a", Lit7);
    }

    static Object lambda21() {
        return runtime.setAndCoerceProperty$Ex(Lit12, Lit71, "BienvenidoUbica.m4a", Lit7);
    }

    static Object lambda22() {
        return runtime.setAndCoerceProperty$Ex(Lit74, Lit75, Lit76, Lit21);
    }

    static Object lambda23() {
        return runtime.setAndCoerceProperty$Ex(Lit74, Lit75, Lit76, Lit21);
    }

    public Object LocationSensor1$LocationChanged(Object $latitude, Object $longitude, Object $altitude, Object $speed) {
        runtime.sanitizeComponentData($latitude);
        runtime.sanitizeComponentData($longitude);
        runtime.sanitizeComponentData($altitude);
        runtime.sanitizeComponentData($speed);
        runtime.setThisForm();
        if (runtime.callYailPrimitive(runtime.yail$Mnequal$Qu, LList.list2(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, runtime.$Stthe$Mnnull$Mnvalue$St), Lit4), Lit78, "=") == Boolean.FALSE) {
            return Values.empty;
        }
        runtime.setAndCoerceProperty$Ex(Lit60, Lit34, runtime.getProperty$1(Lit74, Lit79), Lit7);
        runtime.setAndCoerceProperty$Ex(Lit33, Lit34, runtime.getProperty$1(Lit74, Lit80), Lit7);
        runtime.setAndCoerceProperty$Ex(Lit35, Lit34, runtime.getProperty$1(Lit74, Lit81), Lit7);
        runtime.callComponentMethod(Lit12, Lit32, LList.Empty, LList.Empty);
        runtime.setAndCoerceProperty$Ex(Lit12, Lit71, "listoUbica.m4a", Lit7);
        runtime.callComponentMethod(Lit12, Lit13, LList.Empty, LList.Empty);
        runtime.addGlobalVarToCurrentFormEnvironment(Lit3, Lit26);
        return runtime.setAndCoerceProperty$Ex(Lit82, Lit83, Boolean.TRUE, Lit9);
    }

    static Object lambda24() {
        runtime.setAndCoerceProperty$Ex(Lit82, Lit83, Boolean.FALSE, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit82, Lit87, Lit88, Lit21);
    }

    static Object lambda25() {
        runtime.setAndCoerceProperty$Ex(Lit82, Lit83, Boolean.FALSE, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit82, Lit87, Lit88, Lit21);
    }

    public Object Clock1$Timer() {
        runtime.setThisForm();
        runtime.callComponentMethod(Lit41, Lit42, LList.list1(runtime.getProperty$1(Lit60, Lit34)), Lit90);
        runtime.setAndCoerceProperty$Ex(Lit82, Lit83, Boolean.FALSE, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit91, Lit83, Boolean.TRUE, Lit9);
    }

    static Object lambda26() {
        runtime.setAndCoerceProperty$Ex(Lit91, Lit83, Boolean.FALSE, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit91, Lit87, Lit95, Lit21);
    }

    static Object lambda27() {
        runtime.setAndCoerceProperty$Ex(Lit91, Lit83, Boolean.FALSE, Lit9);
        return runtime.setAndCoerceProperty$Ex(Lit91, Lit87, Lit95, Lit21);
    }

    public Object Clock2$Timer() {
        runtime.setThisForm();
        runtime.callComponentMethod(Lit12, Lit32, LList.Empty, LList.Empty);
        runtime.setAndCoerceProperty$Ex(Lit12, Lit71, "iniciaNavega.m4a", Lit7);
        runtime.callComponentMethod(Lit12, Lit13, LList.Empty, LList.Empty);
        return runtime.setAndCoerceProperty$Ex(Lit91, Lit83, Boolean.FALSE, Lit9);
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
        Screen1 = this;
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
        Screen1 closureEnv = this;
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
