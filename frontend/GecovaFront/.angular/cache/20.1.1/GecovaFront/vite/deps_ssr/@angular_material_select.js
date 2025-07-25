import { createRequire } from 'module';const require = createRequire(import.meta.url);
import {
  MAT_SELECT_CONFIG,
  MAT_SELECT_SCROLL_STRATEGY,
  MAT_SELECT_SCROLL_STRATEGY_PROVIDER,
  MAT_SELECT_SCROLL_STRATEGY_PROVIDER_FACTORY,
  MAT_SELECT_TRIGGER,
  MatSelect,
  MatSelectChange,
  MatSelectModule,
  MatSelectTrigger
} from "./chunk-STGHJVZS.js";
import {
  MatOptgroup,
  MatOption
} from "./chunk-BYTBC2R5.js";
import "./chunk-KRSNOULD.js";
import {
  MatError,
  MatFormField,
  MatHint,
  MatLabel,
  MatPrefix,
  MatSuffix
} from "./chunk-H2ELDY4P.js";
import "./chunk-TBHOV5RE.js";
import "./chunk-FW6U4QHN.js";
import "./chunk-MWMBLVE4.js";
import "./chunk-JMCJ3LPB.js";
import "./chunk-ZNAWLB7A.js";
import "./chunk-QMJTL24X.js";
import "./chunk-3MDID5SH.js";
import "./chunk-ULGGWXCW.js";
import "./chunk-XX6QYWPG.js";
import "./chunk-WQKZDKPJ.js";
import "./chunk-RR34B53G.js";
import "./chunk-PPTBRSJB.js";
import "./chunk-J6RRMTFL.js";
import "./chunk-DHJNJT7A.js";
import "./chunk-TNR5RIZE.js";
import "./chunk-DNDYZLMK.js";
import "./chunk-VB4ZP74V.js";
import "./chunk-ELAVW2DZ.js";
import {
  require_cjs,
  require_operators
} from "./chunk-ZNW3QJ24.js";
import {
  __toESM
} from "./chunk-6DU2HRTW.js";

// node_modules/@angular/material/fesm2022/select.mjs
var import_rxjs = __toESM(require_cjs(), 1);
var import_operators = __toESM(require_operators(), 1);
var matSelectAnimations = {
  // Represents
  // trigger('transformPanel', [
  //   state(
  //     'void',
  //     style({
  //       opacity: 0,
  //       transform: 'scale(1, 0.8)',
  //     }),
  //   ),
  //   transition(
  //     'void => showing',
  //     animate(
  //       '120ms cubic-bezier(0, 0, 0.2, 1)',
  //       style({
  //         opacity: 1,
  //         transform: 'scale(1, 1)',
  //       }),
  //     ),
  //   ),
  //   transition('* => void', animate('100ms linear', style({opacity: 0}))),
  // ])
  /** This animation transforms the select's overlay panel on and off the page. */
  transformPanel: {
    type: 7,
    name: "transformPanel",
    definitions: [
      {
        type: 0,
        name: "void",
        styles: {
          type: 6,
          styles: { opacity: 0, transform: "scale(1, 0.8)" },
          offset: null
        }
      },
      {
        type: 1,
        expr: "void => showing",
        animation: {
          type: 4,
          styles: {
            type: 6,
            styles: { opacity: 1, transform: "scale(1, 1)" },
            offset: null
          },
          timings: "120ms cubic-bezier(0, 0, 0.2, 1)"
        },
        options: null
      },
      {
        type: 1,
        expr: "* => void",
        animation: {
          type: 4,
          styles: { type: 6, styles: { opacity: 0 }, offset: null },
          timings: "100ms linear"
        },
        options: null
      }
    ],
    options: {}
  }
};
export {
  MAT_SELECT_CONFIG,
  MAT_SELECT_SCROLL_STRATEGY,
  MAT_SELECT_SCROLL_STRATEGY_PROVIDER,
  MAT_SELECT_SCROLL_STRATEGY_PROVIDER_FACTORY,
  MAT_SELECT_TRIGGER,
  MatError,
  MatFormField,
  MatHint,
  MatLabel,
  MatOptgroup,
  MatOption,
  MatPrefix,
  MatSelect,
  MatSelectChange,
  MatSelectModule,
  MatSelectTrigger,
  MatSuffix,
  matSelectAnimations
};
//# sourceMappingURL=@angular_material_select.js.map
