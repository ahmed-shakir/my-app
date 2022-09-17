package se.supernovait.my;
import com.codename1.rad.annotations.*;
import com.codename1.rad.controllers.*;
import se.supernovait.my.*;
import se.supernovait.my.providers.NotificationsProvider;
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
public class NotificationPage extends AbstractNotificationPage<NotificationPageModel> implements NotificationPageSchema {
    private final ViewContext<NotificationPageModel> context;
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
    public com.codename1.rad.ui.entityviews.EntityListView notifications;
    private static ViewContext<NotificationPageModel> wrapContext(ViewContext<NotificationPageModel> context) {
        com.codename1.rad.controllers.ViewController _viewController = new com.codename1.rad.controllers.ViewController(context.getController());
        return _viewController.createViewContext(NotificationPageModel.class, context.getEntity());
    }

    private Component registerViewController(Component cmp) {
        this.context.getController().setView(cmp);        return this.context.getController().getView();
    }

    @Override
    public NotificationPageModel getEntity(){ return (NotificationPageModel)super.getEntity();}
    public NotificationPage(@Inject ViewContext<NotificationPageModel> context) {
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
         attributes.put("xsi:noNamespaceSchemaLocation", "NotificationPage.xsd");
        com.codename1.rad.ui.builders.ContainerBuilder _builder = new com.codename1.rad.ui.builders.ContainerBuilder(context, "border", attributes);
        _builder.setParentContainer(_currentContainer, null);
        // uiid=WelcomePage
        
        // xmlns:xsi=http://www.w3.org/2001/XMLSchema-instance
        
        // xsi:noNamespaceSchemaLocation=NotificationPage.xsd
        
        com.codename1.ui.Container _cmp = (com.codename1.ui.Container)_builder.getComponent();
        // uiid=WelcomePage
        _cmp.setUIID("WelcomePage");
        // xmlns:xsi=http://www.w3.org/2001/XMLSchema-instance
        
        // xsi:noNamespaceSchemaLocation=NotificationPage.xsd
        
        // 7 child nodes
        // Create child components
        Container _tmp_old_currentContainer = _currentContainer;
        _currentContainer = _cmp;
        // 7 child nodes
        // Child tag import is type null
        // Child tag title is type com.codename1.rad.ui.beans.Title
        // Create bean com.codename1.rad.ui.beans.Title
        createBean2();
        // Child tag entityList is type com.codename1.rad.ui.entityviews.EntityListView
        // Add child component  with child tag entityList
        _cmp.addComponent(_builder.parseConstraint("center"), createComponent4());
        _currentContainer = _tmp_old_currentContainer;
        // Set up bindings
        // Set up action Bindings
        return _cmp;
    }
    private com.codename1.ui.Label createComponent3() {
        java.util.Map<String,String> attributes = new java.util.HashMap<String,String>();
         attributes.put("rad-id", "3");
         attributes.put("text", "Notifications");
        com.codename1.ui.Label _cmp = new com.codename1.ui.Label();
        com.codename1.rad.ui.builders.SimpleComponentDecorator<com.codename1.ui.Label> _builder = new com.codename1.rad.ui.builders.SimpleComponentDecorator<com.codename1.ui.Label>(_cmp, context, "label", attributes);
        // text=Notifications
        _cmp.setText("Notifications");
        // 0 child nodes
        // Create child components
        // 0 child nodes
        // Set up bindings
        // Set up action Bindings
        return _cmp;
    }
    private com.codename1.rad.ui.entityviews.EntityListView createComponent4() {
        java.util.Map<String,String> attributes = new java.util.HashMap<String,String>();
         attributes.put("layout-constraint", "center");
         attributes.put("name", "notifications");
         attributes.put("provider", "NotificationsProvider.class");
         attributes.put("rad-id", "4");
        com.codename1.rad.ui.builders.EntityListViewBuilder _builder = new com.codename1.rad.ui.builders.EntityListViewBuilder(context, "entityList", attributes);
        _builder.setParentContainer(_currentContainer, null);
        {
            com.codename1.rad.ui.EntityListCellRenderer _injectedValue = nonNull(context.getController().lookup(com.codename1.rad.ui.EntityListCellRenderer.class), null);
            if (_injectedValue != null) _builder.renderer((com.codename1.rad.ui.EntityListCellRenderer)_injectedValue);
        }
        {
            com.codename1.rad.nodes.Node _injectedValue = _setParent(com.codename1.rad.nodes.ViewNode.class, new com.codename1.rad.nodes.ViewNode());
            if (_injectedValue != null) _builder.parentNode((com.codename1.rad.nodes.Node)_injectedValue);
        }
        // name=notifications
        
        // provider=NotificationsProvider.class
        _builder.provider(NotificationsProvider.class);
        // 1 row templates defined for list view
        {
            class Renderer4 implements com.codename1.rad.ui.EntityListCellRenderer {
                public EntityView getListCellRendererComponent(EntityListView list, Entity value, int index, boolean isSelected, boolean isFocused) {
                    Entity _old_rowModel = NotificationPage.this.rowModel;
                    NotificationPage.this.rowModel = value;
                    int _old_rowIndex = NotificationPage.this.rowIndex;
                    NotificationPage.this.rowIndex = index;
                    boolean _old_rowSelected = NotificationPage.this.rowSelected;
                    NotificationPage.this.rowSelected = isSelected;
                    boolean _old_rowFocused = NotificationPage.this.rowFocused;
                    NotificationPage.this.rowFocused = isFocused;
                    EntityListView _old_rowList = NotificationPage.this.rowList;
                    NotificationPage.this.rowList = list;
                    com.codename1.rad.nodes.ViewNode _viewNode = new com.codename1.rad.nodes.ViewNode();
                    _viewNode.setParent(context.getNode());
                    ViewContext _old_subContext = NotificationPage.this.subContext;
                    NotificationPage.this.subContext = new ViewContext(viewController, rowModel, _viewNode);
                    EntityView _old_rowView = NotificationPage.this.rowView;
                    try {
                        if (true) {
                            return (EntityView) createComponent6();
                        }
                        throw new RuntimeException("No row view matches the provided condition.");
                    } finally {
                        NotificationPage.this.rowModel = _old_rowModel;
                        NotificationPage.this.rowIndex = _old_rowIndex;
                        NotificationPage.this.rowSelected = _old_rowSelected;
                        NotificationPage.this.rowFocused = _old_rowFocused;
                        NotificationPage.this.rowList = _old_rowList;
                        NotificationPage.this.subContext = _old_subContext;
                        NotificationPage.this.rowView = _old_rowView;
                    }
                }
            }
            _builder.renderer(new Renderer4());
        }
        com.codename1.rad.ui.entityviews.EntityListView _cmp = (com.codename1.rad.ui.entityviews.EntityListView)_builder.getComponent();
        // name=notifications
        _cmp.setName("notifications");
        // 3 child nodes
        // Create child components
        Container _tmp_old_currentContainer = _currentContainer;
        _currentContainer = _cmp;
        // 3 child nodes
        // Child tag row-template is type null
        _currentContainer = _tmp_old_currentContainer;
        // Set up bindings
        // Set up action Bindings
        notifications = _cmp;
        return _cmp;
    }
    private se.supernovait.my.NotificationView createComponent6() {
        Entity rowModel = this.rowModel;
        int rowIndex = this.rowIndex;
        boolean rowSelected = this.rowSelected;
        boolean rowFocused = this.rowFocused;
        EntityListView rowList = this.rowList;
        ViewContext<Entity> context = (ViewContext<Entity>)this.subContext;
        java.util.Map<String,String> attributes = new java.util.HashMap<String,String>();
         attributes.put("rad-id", "6");
         attributes.put("view-model", "rowModel");
        se.supernovait.my.NotificationView _cmp = new se.supernovait.my.NotificationView(new com.codename1.rad.ui.ViewContext(context.getController(), se.supernovait.my.models.NotificationWrapper.wrap(rowModel)));
        com.codename1.rad.ui.builders.SimpleComponentDecorator<se.supernovait.my.NotificationView> _builder = new com.codename1.rad.ui.builders.SimpleComponentDecorator<se.supernovait.my.NotificationView>(_cmp, context, "notificationView", attributes);
if (NotificationPage.this.rowView == null) {
    NotificationPage.this.rowView = (EntityView)_cmp;
    NotificationPage.this.subContext.setEntityView((EntityView)_cmp);
}
        EntityView<Entity> view = (EntityView<Entity>)NotificationPage.this.rowView;
        EntityView<Entity> rowView = view;
        // 1 child nodes
        // Create child components
        Container _tmp_old_currentContainer = _currentContainer;
        _currentContainer = _cmp;
        // 1 child nodes
        // Child tag com.codename1.rad.ui.ViewContext is type com.codename1.rad.ui.ViewContext
        _currentContainer = _tmp_old_currentContainer;
        // Set up bindings
        // Set up action Bindings
        return _cmp;
    }
    private com.codename1.rad.ui.beans.Title createBean2() {
        com.codename1.rad.ui.beans.Title _bean = new com.codename1.rad.ui.beans.Title(new com.codename1.rad.ui.ViewContext(context.getController(), context.getEntity()));
        {
            com.codename1.ui.Component _injectedValue = createComponent3();
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
