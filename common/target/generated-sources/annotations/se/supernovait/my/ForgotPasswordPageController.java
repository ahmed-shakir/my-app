package se.supernovait.my;
import com.codename1.rad.annotations.*;
import com.codename1.rad.controllers.FormController;
import com.codename1.rad.controllers.Controller;
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
public class ForgotPasswordPageController extends FormController implements IForgotPasswordPageController, FormController.CloneableFormController<ForgotPasswordPageController> {
    private ForgotPasswordPageModel viewModel;
    public ForgotPasswordPageController(@Inject Controller parent) {
        super(parent);
        this.viewModel = createViewModel();
    }
    public ForgotPasswordPageController(@Inject Controller parent, @Inject ForgotPasswordPageModel viewModel) {
        super(parent);
        this.viewModel = viewModel != null ? viewModel : createViewModel();
    }
    public ForgotPasswordPageModel createViewModel() {
        return new se.supernovait.my.ForgotPasswordPageModelImpl();
    }
    @Override
    public ForgotPasswordPageController cloneAndReplace() {
        ForgotPasswordPageController out = new ForgotPasswordPageController(getParent(), viewModel);
        out.show();
        return out;
    }
    @Override
    protected void onStartController() {
        super.onStartController();
        setView(new ForgotPasswordPage(new ViewContext<ForgotPasswordPageModel>(this, viewModel)));
    }
    @Override
    protected void onStopController() {
        super.onStopController();
    }
}
