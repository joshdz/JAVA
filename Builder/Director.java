public class Director{
        protected Builder  builder;
        public Builder getBuilder(String type)
        {
            if (type == "Hawaiian")
            {
                return new HawBuilder();
            }
            if (type == "DoubleBurger")
            {
                return new DoubleBuilder();
            }

            return new  DoubleBuilder();
        }

        public Hamburger orderHamburger(String type)
        {
            builder = getBuilder(type);
            builder.createHamburger();
            return builder.getHamburger();
        }

 
}