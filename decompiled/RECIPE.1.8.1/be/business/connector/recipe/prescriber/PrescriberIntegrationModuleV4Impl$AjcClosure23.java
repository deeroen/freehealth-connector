package be.business.connector.recipe.prescriber;

import be.recipe.services.prescriber.PutVisionParam;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.AroundClosure;

public class PrescriberIntegrationModuleV4Impl$AjcClosure23 extends AroundClosure {
   public PrescriberIntegrationModuleV4Impl$AjcClosure23(Object[] var1) {
      super(var1);
   }

   public Object run(Object[] var1) {
      Object[] var2 = super.state;
      return PrescriberIntegrationModuleV4Impl.putData_aroundBody22((PrescriberIntegrationModuleV4Impl)var2[0], (PutVisionParam)var2[1], (JoinPoint)var2[2]);
   }
}
