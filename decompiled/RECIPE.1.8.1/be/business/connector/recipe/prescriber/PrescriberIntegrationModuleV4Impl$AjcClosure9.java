package be.business.connector.recipe.prescriber;

import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.AroundClosure;

public class PrescriberIntegrationModuleV4Impl$AjcClosure9 extends AroundClosure {
   public PrescriberIntegrationModuleV4Impl$AjcClosure9(Object[] var1) {
      super(var1);
   }

   public Object run(Object[] var1) {
      Object[] var2 = super.state;
      PrescriberIntegrationModuleV4Impl.revokePrescription_aroundBody8((PrescriberIntegrationModuleV4Impl)var2[0], (String)var2[1], (String)var2[2], (JoinPoint)var2[3]);
      return null;
   }
}
