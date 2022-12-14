package se.supernovait.my;
import com.codename1.rad.annotations.*;
import com.codename1.rad.controllers.*;
import se.supernovait.my.*;
import static com.codename1.rad.util.NonNull.nonNull;
import static com.codename1.rad.util.NonNull.nonNullEntries;
import com.codename1.ui.spinner.Picker;
import com.codename1.rad.schemas.*;
import com.codename1.rad.ui.builders.*;
import ca.weblite.shared.components.*;
import com.codename1.rad.models.*;
import com.codename1.rad.nodes.*;
import com.codename1.rad.ui.entityviews.*;
import com.codename1.rad.ui.beans.*;
import com.codename1.rad.propertyviews.*;
import com.codename1.ui.*;
import com.codename1.ui.plaf.*;
import com.codename1.components.*;
import static com.codename1.ui.CN.*;
import com.codename1.ui.layouts.*;
import com.codename1.rad.ui.ViewContext;
import com.codename1.rad.ui.EntityView;
@Autogenerated
public class WelcomePage extends AbstractWelcomePage<WelcomePageModel> implements WelcomePageSchema {
    private final ViewContext<WelcomePageModel> context;
    private final FormController formController;
    private final ApplicationController applicationController;
    private final AppSectionController sectionController;
    private final ViewController viewController;
    private final FormController parentFormController;
    private java.util.List<Runnable> __initOnceListeners;
    private java.util.List<Runnable> __deinitListeners;
    // Placeholder for the row model when creating EntityListCellRenderer.
    // Can access inside <script> tags inside <row-template>
    private com.codename1.rad.models.Entity rowModel;
    // Placeholder for the row index when creating EntityListCellRenderer.
    // Can access inside <script> tags inside <row-template>
    private int rowIndex;
    // Placeholder for the row selected state when creating EntityListCellRenderer.
    // Can access inside <script> tags inside <row-template>
    private boolean rowSelected;
    // Placeholder for the row focused state when creating EntityListCellRenderer.
    // Can access inside <script> tags inside <row-template>
    private boolean rowFocused;
    // Placeholder for the EntityListView when creating EntityListCellRenderer.
    // Can access inside <script> tags inside <row-template>
    private com.codename1.rad.ui.entityviews.EntityListView rowList;
    private EntityView view = this;
    private EntityView rowView;
    private ViewContext subContext;
    private Container _currentContainer;
    public com.codename1.ui.Button ShowInfoAction;
    private static ViewContext<WelcomePageModel> wrapContext(ViewContext<WelcomePageModel> context) {
        com.codename1.rad.controllers.ViewController _viewController = new com.codename1.rad.controllers.ViewController(context.getController());
        return _viewController.createViewContext(WelcomePageModel.class, context.getEntity());
    }

    private Component registerViewController(Component cmp) {
        this.context.getController().setView(cmp);        return this.context.getController().getView();
    }

    @Override
    public WelcomePageModel getEntity(){ return (WelcomePageModel)super.getEntity();}
    public WelcomePage(@Inject ViewContext<WelcomePageModel> context) {
        super(wrapContext(context));
        this.context = getContext();
        this.formController = this.context.getController().getFormController();
        this.viewController = this.context.getController();
        this.applicationController = this.context.getController().getApplicationController();
        this.sectionController = this.context.getController().getSectionController();
        this.parentFormController = (this.formController == null || this.formController.getParent() == null) ? null : this.formController.getParent().getFormController();
        getAllStyles().stripMarginAndPadding();
        setLayout(new BorderLayout());
        _currentContainer = this;
        add(BorderLayout.CENTER, registerViewController(createComponent0()));
    }
    private com.codename1.ui.Container createComponent0() {
        java.util.Map<String,String> attributes = new java.util.HashMap<String,String>();
         attributes.put("rad-id", "0");
         attributes.put("uiid", "WelcomePage");
         attributes.put("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
         attributes.put("xsi:noNamespaceSchemaLocation", "WelcomePage.xsd");
        com.codename1.rad.ui.builders.ContainerBuilder _builder = new com.codename1.rad.ui.builders.ContainerBuilder(context, "border", attributes);
        _builder.setParentContainer(_currentContainer, null);
        // uiid=WelcomePage
        
        // xmlns:xsi=http://www.w3.org/2001/XMLSchema-instance
        
        // xsi:noNamespaceSchemaLocation=WelcomePage.xsd
        
        com.codename1.ui.Container _cmp = (com.codename1.ui.Container)_builder.getComponent();
        // uiid=WelcomePage
        _cmp.setUIID("WelcomePage");
        // xmlns:xsi=http://www.w3.org/2001/XMLSchema-instance
        
        // xsi:noNamespaceSchemaLocation=WelcomePage.xsd
        
        // 7 child nodes
        // Create child components
        Container _tmp_old_currentContainer = _currentContainer;
        _currentContainer = _cmp;
        // 7 child nodes
        // Child tag title is type com.codename1.rad.ui.beans.Title
        // Create bean com.codename1.rad.ui.beans.Title
        createBean1();
        // Child tag y is type com.codename1.ui.Container
        // Add child component  with child tag y
        _cmp.addComponent(_builder.parseConstraint("center"), createComponent3());
        // Child tag center is type com.codename1.ui.Container
        // Add child component  with child tag center
        _cmp.addComponent(_builder.parseConstraint("south"), createComponent9());
        _currentContainer = _tmp_old_currentContainer;
        // Set up bindings
        // Set up action Bindings
        return _cmp;
    }
    private com.codename1.ui.Label createComponent2() {
        java.util.Map<String,String> attributes = new java.util.HashMap<String,String>();
         attributes.put("rad-id", "2");
         attributes.put("text", "Items manager");
        com.codename1.ui.Label _cmp = new com.codename1.ui.Label();
        com.codename1.rad.ui.builders.SimpleComponentDecorator<com.codename1.ui.Label> _builder = new com.codename1.rad.ui.builders.SimpleComponentDecorator<com.codename1.ui.Label>(_cmp, context, "label", attributes);
        // text=Items manager
        _cmp.setText("Items manager");
        // 0 child nodes
        // Create child components
        // 0 child nodes
        // Set up bindings
        // Set up action Bindings
        return _cmp;
    }
    private com.codename1.ui.Container createComponent3() {
        java.util.Map<String,String> attributes = new java.util.HashMap<String,String>();
         attributes.put("layout-constraint", "center");
         attributes.put("rad-id", "3");
        com.codename1.rad.ui.builders.ContainerBuilder _builder = new com.codename1.rad.ui.builders.ContainerBuilder(context, "y", attributes);
        _builder.setParentContainer(_currentContainer, null);
        com.codename1.ui.Container _cmp = (com.codename1.ui.Container)_builder.getComponent();
        // 7 child nodes
        // Create child components
        Container _tmp_old_currentContainer = _currentContainer;
        _currentContainer = _cmp;
        // 7 child nodes
        // Child tag spanLabel is type com.codename1.components.SpanLabel
        // Add child component  with child tag spanLabel
        {
            com.codename1.ui.Component _childCmp = createComponent4();
            if (_childCmp.getClientProperty("RAD_NO_ADD") == null) {
                _cmp.addComponent(_childCmp);
            }
        }
        // Child tag button is type com.codename1.ui.Button
        // Add child component  with child tag button
        {
            com.codename1.ui.Component _childCmp = createComponent5();
            if (_childCmp.getClientProperty("RAD_NO_ADD") == null) {
                _cmp.addComponent(_childCmp);
            }
        }
        // Child tag flow is type com.codename1.ui.Container
        // Add child component  with child tag flow
        {
            com.codename1.ui.Component _childCmp = createComponent6();
            if (_childCmp.getClientProperty("RAD_NO_ADD") == null) {
                _cmp.addComponent(_childCmp);
            }
        }
        _currentContainer = _tmp_old_currentContainer;
        // Set up bindings
        // Set up action Bindings
        return _cmp;
    }
    private com.codename1.components.SpanLabel createComponent4() {
        java.util.Map<String,String> attributes = new java.util.HashMap<String,String>();
         attributes.put("rad-id", "4");
         attributes.put("textUIID", "WelcomeLabel");
        com.codename1.components.SpanLabel _cmp = new com.codename1.components.SpanLabel();
        com.codename1.rad.ui.builders.SimpleComponentDecorator<com.codename1.components.SpanLabel> _builder = new com.codename1.rad.ui.builders.SimpleComponentDecorator<com.codename1.components.SpanLabel>(_cmp, context, "spanLabel", attributes);
        _cmp.setText("Make everything fun, experience an easier and better items manager.");        // textUIID=WelcomeLabel
        _cmp.setTextUIID("WelcomeLabel");
        // 1 child nodes
        // Create child components
        Container _tmp_old_currentContainer = _currentContainer;
        _currentContainer = _cmp;
        // 1 child nodes
        _currentContainer = _tmp_old_currentContainer;
        // Set up bindings
        // Set up action Bindings
        return _cmp;
    }
    private com.codename1.ui.Button createComponent5() {
        java.util.Map<String,String> attributes = new java.util.HashMap<String,String>();
         attributes.put("rad-href", "#SignupPage");
         attributes.put("rad-id", "5");
         attributes.put("uiid", "NewAccountButton");
        com.codename1.ui.Button _cmp = new com.codename1.ui.Button();
        com.codename1.rad.ui.builders.SimpleComponentDecorator<com.codename1.ui.Button> _builder = new com.codename1.rad.ui.builders.SimpleComponentDecorator<com.codename1.ui.Button>(_cmp, context, "button", attributes);
        _cmp.setText("Create account");        // uiid=NewAccountButton
        _cmp.setUIID("NewAccountButton");
        // 1 child nodes
        // Create child components
        // 1 child nodes
        // Set up bindings
        // Set up action Bindings
        _cmp.addActionListener(event -> {
            if (event.isConsumed()) return;
        com.codename1.rad.controllers.FormController _rad_href_controller = (com.codename1.rad.controllers.FormController)getContext().getController().createObjectWithFactory(se.supernovait.my.ISignupPageController.class, new Object[]{formController});
        if (_rad_href_controller == null) {
            _rad_href_controller = new se.supernovait.my.SignupPageController(formController);
        }
        _rad_href_controller.show();
        });
        return _cmp;
    }
    private com.codename1.ui.Container createComponent6() {
        java.util.Map<String,String> attributes = new java.util.HashMap<String,String>();
         attributes.put("rad-id", "6");
        com.codename1.rad.ui.builders.ContainerBuilder _builder = new com.codename1.rad.ui.builders.ContainerBuilder(context, "flow", attributes);
        _builder.setParentContainer(_currentContainer, null);
        com.codename1.ui.Container _cmp = (com.codename1.ui.Container)_builder.getComponent();
        // 5 child nodes
        // Create child components
        Container _tmp_old_currentContainer = _currentContainer;
        _currentContainer = _cmp;
        // 5 child nodes
        // Child tag label is type com.codename1.ui.Label
        // Add child component  with child tag label
        {
            com.codename1.ui.Component _childCmp = createComponent7();
            if (_childCmp.getClientProperty("RAD_NO_ADD") == null) {
                _cmp.addComponent(_childCmp);
            }
        }
        // Child tag button is type com.codename1.ui.Button
        // Add child component  with child tag button
        {
            com.codename1.ui.Component _childCmp = createComponent8();
            if (_childCmp.getClientProperty("RAD_NO_ADD") == null) {
                _cmp.addComponent(_childCmp);
            }
        }
        _currentContainer = _tmp_old_currentContainer;
        // Set up bindings
        // Set up action Bindings
        return _cmp;
    }
    private com.codename1.ui.Label createComponent7() {
        java.util.Map<String,String> attributes = new java.util.HashMap<String,String>();
         attributes.put("rad-id", "7");
         attributes.put("uiid", "SmallLabel");
        com.codename1.ui.Label _cmp = new com.codename1.ui.Label();
        com.codename1.rad.ui.builders.SimpleComponentDecorator<com.codename1.ui.Label> _builder = new com.codename1.rad.ui.builders.SimpleComponentDecorator<com.codename1.ui.Label>(_cmp, context, "label", attributes);
        _cmp.setText("Have an account already?");        // uiid=SmallLabel
        _cmp.setUIID("SmallLabel");
        // 1 child nodes
        // Create child components
        // 1 child nodes
        // Set up bindings
        // Set up action Bindings
        return _cmp;
    }
    private com.codename1.ui.Button createComponent8() {
        java.util.Map<String,String> attributes = new java.util.HashMap<String,String>();
         attributes.put("rad-href", "#LoginPage");
         attributes.put("rad-id", "8");
         attributes.put("uiid", "SmallLink");
        com.codename1.ui.Button _cmp = new com.codename1.ui.Button();
        com.codename1.rad.ui.builders.SimpleComponentDecorator<com.codename1.ui.Button> _builder = new com.codename1.rad.ui.builders.SimpleComponentDecorator<com.codename1.ui.Button>(_cmp, context, "button", attributes);
        _cmp.setText("Log in");        // uiid=SmallLink
        _cmp.setUIID("SmallLink");
        // 1 child nodes
        // Create child components
        // 1 child nodes
        // Set up bindings
        // Set up action Bindings
        _cmp.addActionListener(event -> {
            if (event.isConsumed()) return;
        com.codename1.rad.controllers.FormController _rad_href_controller = (com.codename1.rad.controllers.FormController)getContext().getController().createObjectWithFactory(se.supernovait.my.ILoginPageController.class, new Object[]{formController});
        if (_rad_href_controller == null) {
            _rad_href_controller = new se.supernovait.my.LoginPageController(formController);
        }
        _rad_href_controller.show();
        });
        return _cmp;
    }
    private com.codename1.ui.Container createComponent9() {
        java.util.Map<String,String> attributes = new java.util.HashMap<String,String>();
         attributes.put("layout-constraint", "south");
         attributes.put("rad-id", "9");
        com.codename1.rad.ui.builders.ContainerBuilder _builder = new com.codename1.rad.ui.builders.ContainerBuilder(context, "center", attributes);
        _builder.setParentContainer(_currentContainer, null);
        com.codename1.ui.Container _cmp = (com.codename1.ui.Container)_builder.getComponent();
        // 3 child nodes
        // Create child components
        Container _tmp_old_currentContainer = _currentContainer;
        _currentContainer = _cmp;
        // 3 child nodes
        // Child tag flow is type com.codename1.ui.Container
        // Add child component  with child tag flow
        {
            com.codename1.ui.Component _childCmp = createComponent10();
            if (_childCmp.getClientProperty("RAD_NO_ADD") == null) {
                _cmp.addComponent(_childCmp);
            }
        }
        _currentContainer = _tmp_old_currentContainer;
        // Set up bindings
        // Set up action Bindings
        return _cmp;
    }
    private com.codename1.ui.Container createComponent10() {
        java.util.Map<String,String> attributes = new java.util.HashMap<String,String>();
         attributes.put("rad-id", "10");
         attributes.put("rad-leadComponent", "#ShowInfoAction");
        com.codename1.rad.ui.builders.ContainerBuilder _builder = new com.codename1.rad.ui.builders.ContainerBuilder(context, "flow", attributes);
        _builder.setParentContainer(_currentContainer, null);
        com.codename1.ui.Container _cmp = (com.codename1.ui.Container)_builder.getComponent();
        // 3 child nodes
        // Create child components
        Container _tmp_old_currentContainer = _currentContainer;
        _currentContainer = _cmp;
        // 3 child nodes
        // Child tag button is type com.codename1.ui.Button
        // Add child component  with child tag button
        {
            com.codename1.ui.Component _childCmp = createComponent11();
            if (_childCmp.getClientProperty("RAD_NO_ADD") == null) {
                _cmp.addComponent(_childCmp);
            }
        }
        _currentContainer = _tmp_old_currentContainer;
        // Set up bindings
        // Set up action Bindings
        {
            com.codename1.ui.ComponentSelector _leadComponentSelector = com.codename1.ui.ComponentSelector.select("#ShowInfoAction", _cmp);
            if (!_leadComponentSelector.isEmpty()) {
                _cmp.setLeadComponent(_leadComponentSelector.asComponent());
            }
        }
        return _cmp;
    }
    private com.codename1.ui.Button createComponent11() {
        java.util.Map<String,String> attributes = new java.util.HashMap<String,String>();
         attributes.put("materialIcon", "FontImage.MATERIAL_INFO_OUTLINE");
         attributes.put("name", "ShowInfoAction");
         attributes.put("rad-id", "11");
        com.codename1.ui.Button _cmp = new com.codename1.ui.Button();
        com.codename1.rad.ui.builders.SimpleComponentDecorator<com.codename1.ui.Button> _builder = new com.codename1.rad.ui.builders.SimpleComponentDecorator<com.codename1.ui.Button>(_cmp, context, "button", attributes);
        // name=ShowInfoAction
        _cmp.setName("ShowInfoAction");
        // materialIcon=FontImage.MATERIAL_INFO_OUTLINE
        _cmp.setMaterialIcon(FontImage.MATERIAL_INFO_OUTLINE);
        // 0 child nodes
        // Create child components
        // 0 child nodes
        // Set up bindings
        // Set up action Bindings
        ShowInfoAction = _cmp;
        return _cmp;
    }
    private com.codename1.rad.ui.beans.Title createBean1() {
        com.codename1.rad.ui.beans.Title _bean = new com.codename1.rad.ui.beans.Title(new com.codename1.rad.ui.ViewContext(context.getController(), context.getEntity()));
        {
            com.codename1.ui.Component _injectedValue = createComponent2();
            if (_injectedValue != null) _bean.setComponent((com.codename1.ui.Component)_injectedValue);
        }
        // 4 child nodes
        // Create child nodes
        // 4 child nodes
        return _bean;
    }
    @Override
    public void commit() {}
    @Override
    public void update() {}
    @Override
    public void activate() {
        super.activate();
    }
    private <T extends Node> T _setParent(Class<T> cls, T node) {
        node.setParent(getViewNode());
        return node;
    }
    private <T> T _getInjectedParameter(Class<T> type, ViewContext context, Controller controller) {
        T lookedUp = (T)controller.lookup(type);
        if (lookedUp != null) return lookedUp;
        if (type == ViewContext.class) return (T)context;
        if (Entity.class.isAssignableFrom(type)) return (T)context.getEntity();
        if (type.isAssignableFrom(this.getClass())) return (T)this;
        if (type.isAssignableFrom(controller.getClass())) return (T)controller;
        if (type.isAssignableFrom(FormController.class)) return (T)formController;
        if (type.isAssignableFrom(ApplicationController.class)) return (T)applicationController;
        if (type.isAssignableFrom(ViewController.class)) return (T)viewController;
        return null;
    }
    @Override
    protected void initComponent() {
        super.initComponent();
        if (__initOnceListeners != null && !__initOnceListeners.isEmpty()) {
            java.util.List<Runnable> toRun = new java.util.ArrayList<Runnable>(__initOnceListeners);
            __initOnceListeners = null;
            for (Runnable r : toRun) r.run();
        }
    }
    @Override
    protected void deinitialize() {
        if (__deinitListeners != null && !__deinitListeners.isEmpty()) {
            java.util.List<Runnable> toRun = new java.util.ArrayList<Runnable>(__deinitListeners);
            for (Runnable r : toRun) r.run();
        }
        super.deinitialize();
    }
    private void addInitOnceListener(Runnable r) {
        if (__initOnceListeners == null) __initOnceListeners = new java.util.ArrayList<>();
        __initOnceListeners.add(r);
    }
    private void addDeinitListener(Runnable r) {
        if (__deinitListeners == null) __deinitListeners = new java.util.ArrayList<>();
        __deinitListeners.add(r);
    }
    private void back() {
        com.codename1.rad.controllers.ActionSupport.dispatchEvent(new com.codename1.rad.controllers.FormController.FormBackEvent(this));
    }
}
