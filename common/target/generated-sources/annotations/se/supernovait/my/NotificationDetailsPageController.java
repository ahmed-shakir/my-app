package se.supernovait.my;
import com.codename1.rad.annotations.*;
import com.codename1.rad.controllers.FormController;
import com.codename1.rad.controllers.Controller;
import se.supernovait.my.*;
import se.supernovait.my.models.Notification;
import se.supernovait.my.services.NotificationService;
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
public class NotificationDetailsPageController extends FormController implements INotificationDetailsPageController, FormController.CloneableFormController<NotificationDetailsPageController> {
    private Notification viewModel;
    public NotificationDetailsPageController(@Inject Controller parent) {
        super(parent);
        this.viewModel = createViewModel();
    }
    public NotificationDetailsPageController(@Inject Controller parent, @Inject Notification viewModel) {
        super(parent);
        this.viewModel = viewModel != null ? viewModel : createViewModel();
    }
    public Notification createViewModel() {
        return new se.supernovait.my.models.NotificationImpl();
    }
    @Override
    public NotificationDetailsPageController cloneAndReplace() {
        NotificationDetailsPageController out = new NotificationDetailsPageController(getParent(), viewModel);
        out.show();
        return out;
    }
    @Override
    protected void onStartController() {
        super.onStartController();
        setView(new NotificationDetailsPage(new ViewContext<Notification>(this, viewModel)));
    }
    @Override
    protected void onStopController() {
        super.onStopController();
    }
}
